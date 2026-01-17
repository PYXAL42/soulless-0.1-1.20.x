package net.pyxal42.soulless.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MilkMouldItem extends Item {
    public MilkMouldItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        int progressRemaining = 6000 - (stack.getOrCreateNbt().getInt("progress"));
        int seconds = progressRemaining/20;
        String string = seconds > 59?seconds / 60 + "m " + seconds % 60 + "s remaining":seconds % 60 + "s remaining";
        tooltip.add(Text.literal(string).styled((style -> {return style.withColor(Formatting.DARK_GRAY);})));
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        NbtCompound nbt = stack.getOrCreateNbt();
        nbt.putInt("progress",nbt.getInt("progress")+1);
        if (nbt.getInt("progress") > 6000){
            entity.getStackReference(slot).set(ModItems.CHEESY_MOULD.getDefaultStack());
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    @Override
    public boolean allowNbtUpdateAnimation(PlayerEntity player, Hand hand, ItemStack oldStack, ItemStack newStack) {
        return false;
    }

    @Override
    public boolean isItemBarVisible(ItemStack stack) {
        return true;
    }

    @Override
    public int getItemBarStep(ItemStack stack) {
        int progress = stack.getOrCreateNbt().getInt("progress");
        return Math.round(progress * 13.0F / 6000f);
    }

    @Override
    public int getItemBarColor(ItemStack stack) {
        int progress = stack.getOrCreateNbt().getInt("progress");
        float f = Math.max(0.0F, (6000f - (6000f -progress)) / 6000f);
        return MathHelper.hsvToRgb(f / 3.0F, 1.0F, 1.0F);    }
}
