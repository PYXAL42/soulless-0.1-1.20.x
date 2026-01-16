package net.pyxal42.soulless.item;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.nbt.NbtList;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.pyxal42.soulless.Soulless;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AgreementItem extends Item {

    //public List<GameProfile> profileList = new ArrayList<>();
    private boolean firstTick = true;

    public AgreementItem(Settings settings) {
        super(settings);
    }


    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

        for (NbtElement profile:getGPList(stack).stream().toList()){
            if (NbtHelper.toGameProfile((NbtCompound) profile) != null) {
                tooltip.add(Text.literal(NbtHelper.toGameProfile((NbtCompound) profile).getName()).styled((style -> style.withColor(Formatting.BLUE))));
            }
        }
        super.appendTooltip(stack, world, tooltip, context);
    }



    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        NbtCompound nbt = stack.getOrCreateSubNbt("agreementNbt");

        if (getGPList(stack).size() >1 && nbt.contains("name")){
            stack.getOrCreateSubNbt("display").putString("Name", nbt.getString("name"));
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        NbtCompound nbt = stack.getOrCreateSubNbt("agreementNbt");
        NbtList profileList = getGPList(stack);
        if (user.isSneaking()) {
            if (profileList.size() > 1){
                nbt.putBoolean("sealed",true);
                return TypedActionResult.success(stack);
            }else{
                if (world.isClient) user.sendMessage(Text.literal("You can only seal an Agreement with 2+ signors").styled((style -> style.withColor(Formatting.RED))),true);
            }
        }else {
            if (profileList != null && !profileList.contains(profileNbt(user.getGameProfile())) && !nbt.getBoolean("sealed") && profileList.size() < 8) {
                profileList.add(profileNbt(user.getGameProfile()));
                nbt.put("gpList", profileList);
                if (profileList.size() > 1) {
                    nbt.putString("name", Text.Serializer.toJson(stack.getName()));
                }
                return TypedActionResult.success(stack);
            }
        }
        return super.use(world, user, hand);
    }


    @Override
    public boolean hasGlint(ItemStack stack) {
        return getGPList(stack).size() >1;
    }
    private NbtCompound profileNbt(GameProfile profile){
        return NbtHelper.writeGameProfile(new NbtCompound(), profile);
    }
    private NbtList getGPList(ItemStack stack){
        return stack.getOrCreateSubNbt("agreementNbt").getList("gpList",NbtElement.COMPOUND_TYPE);
    }


}
