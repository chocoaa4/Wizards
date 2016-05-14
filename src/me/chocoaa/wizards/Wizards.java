package me.chocoaa.wizards;

import org.apache.logging.log4j.core.net.Priority;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Chocoaa on 07/05/2016.
 */
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static org.bukkit.enchantments.Enchantment.FIRE_ASPECT;

public class Wizards extends JavaPlugin implements Listener {



    @Override
    public void onEnable() {
        Bukkit.getServer().getLogger().info(ChatColor.GREEN + "Wizards is being Enabled!");
        getConfig().options().copyDefaults(true);
        saveConfig();
        Bukkit.getServer().getPluginManager().registerEvents(this, this);

        ShapedRecipe wandA = new ShapedRecipe(A());
        wandA.shape("$.$","$$$"," . ");
        wandA.setIngredient('$',Material.DIAMOND);
        wandA.setIngredient('.',Material.STICK);
        Bukkit.getServer().addRecipe(wandA);

        cooldownTime = new HashMap<Player, Integer>();
        cooldownTask = new HashMap<Player, BukkitRunnable>();
        r = new Random();




    }




    public ItemStack Laucer() {


        ItemStack Laucer = new ItemStack(Material.STICK, 1);
        Laucer.addUnsafeEnchantment(FIRE_ASPECT, 1);
        ItemMeta lmeta = Laucer.getItemMeta();
        lmeta.setDisplayName(ChatColor.RED + "Laucer Wand");
        List<String> lore2 = new ArrayList<String>();
        lore2.add(ChatColor.GREEN + "First tier wizard wand");
        lmeta.setLore(lore2);
        Laucer.setItemMeta(lmeta);
        return Laucer;
        // shoots Snowball


    }


    public ItemStack A() {


        ItemStack A = new ItemStack(Material.STONE_AXE);
        A.addUnsafeEnchantment(FIRE_ASPECT,3);
        ItemMeta Am = A.getItemMeta();
        Am.setDisplayName(ChatColor.RED + "A Wand");
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GREEN + "2nd Tier wand");
        Am.setLore(lore);
        A.setItemMeta(Am);

        return A;
        // shoots Arrow
    }



    public ItemStack SilverOblivion() {


        ItemStack SilverOblivion = new ItemStack(Material.IRON_AXE);
        SilverOblivion.addUnsafeEnchantment(FIRE_ASPECT,4);
        ItemMeta so = SilverOblivion.getItemMeta();
        so.setDisplayName(ChatColor.RED + "Silver Oblivion");
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GREEN + "3rd Tier wand");
        so.setLore(lore);
        SilverOblivion.setItemMeta(so);

        return SilverOblivion;
    }


    public ItemStack Spectra() {


        ItemStack Spectra = new ItemStack(Material.GOLD_AXE);
        Spectra.addUnsafeEnchantment(FIRE_ASPECT,5);
        ItemMeta sp = Spectra.getItemMeta();
        sp.setDisplayName(ChatColor.RED + "Spectre");
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GREEN + "4th Tier wand");
        sp.setLore(lore);
        Spectra.setItemMeta(sp);

        return Spectra;
    }

    public ItemStack Ultra() {


        ItemStack Ultra = new ItemStack(Material.DIAMOND_AXE);
        Ultra.addUnsafeEnchantment(FIRE_ASPECT,6);
        ItemMeta ul = Ultra.getItemMeta();
        ul.setDisplayName(ChatColor.RED + "Ultra");
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GREEN + "The ultimate wand");
        ul.setLore(lore);
        Ultra.setItemMeta(ul);

        return Ultra;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        // wand a


        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only players can use this command!");
            return false;
        }
        Player p = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("wand") && (args.length < 1)) {
            p.sendMessage(ChatColor.GREEN + "Please specify a wand!");
            return false;

        }


        if (args[0].equalsIgnoreCase("A")) {
            p.getInventory().addItem(A());
            p.sendMessage(ChatColor.GREEN + "You have just received the A wand !");
            return true;
        }

        if (args[0].equalsIgnoreCase("Laucer")) {
            p.getInventory().addItem(Laucer());
            p.sendMessage(ChatColor.GREEN + "You have just received the Laucer wand !");
            return true;
        }
        return true;


    }

    @Override
    public void onDisable() {
        Bukkit.getServer().getLogger().info(ChatColor.GREEN + "Wizards is being Disabled!");
        getServer().clearRecipes();

    }



}
