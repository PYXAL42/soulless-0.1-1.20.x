package net.pyxal42.soulless.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.pyxal42.soulless.block.ModBlocks;
import net.pyxal42.soulless.item.ModItems;

public class ModLangGenerator extends FabricLanguageProvider {
    public ModLangGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    private static String snakeToTitleCase(String snake) {
        String[] words = snake.split("_");
        StringBuilder titleCase = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                titleCase.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return titleCase.toString().trim();
    }



    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        for (Block block: ModBlocks.MODBLOCKLIST){
            translationBuilder.add(block, snakeToTitleCase((Registries.BLOCK.getId(block).getPath())));
        }

        for (Item item: ModItems.MODITEMLIST){
            translationBuilder.add(item,snakeToTitleCase((Registries.ITEM.getId(item).getPath())));
        }
    }
}
