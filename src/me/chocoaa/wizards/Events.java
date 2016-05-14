package me.chocoaa.wizards;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by Chocoaa on 11/05/2016.
 */
public class Events extends JavaPlugin implements Listener {

    private ItemStack getItemStackA() {
        return A();
    }

    private ItemStack A() {
        return A();
    }

    private ItemStack Laucer() {
        return Laucer();
    }

    private ItemStack SilverOblivion() {
        return SilverOblivion();
    }

    private ItemStack Spectra() {
        return Spectra();
    }

    private ItemStack Ultra() {
        return Ultra();
    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent je) {
        Player p = je.getPlayer();
        p.sendMessage(ChatColor.GOLD + " Welcome " + p.getName() + ChatColor.GOLD + " to the server! Enjoy your time!" + ChatColor.BLUE + "Make sure you try out the new wizards plugin!");
    }


    @Deprecated
    @EventHandler
    public void onEntityDamageWandA(EntityDamageByEntityEvent e) {

        if (e.getDamager() instanceof Arrow) {
            Arrow f = (Arrow) e.getDamager();
            if (f.getShooter() instanceof Player) {
                Player shooter = (Player) f.getShooter();
                if (shooter.getItemInHand().equals(A())) {
                    e.setDamage(10.0);


                }
            }
        }


    }

    @Deprecated
    @EventHandler
    public void onPlayerInteractAwand(PlayerInteractEvent e) {
        Player g = e.getPlayer();

        if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && g.getItemInHand().equals(A())) {
            e.getPlayer().launchProjectile(Arrow.class);
        }


    }


    @Deprecated
    @EventHandler
    public void onEntityDamageWadLaucer(EntityDamageByEntityEvent e) {

        if (e.getDamager() instanceof Fireball) {
            Snowball f = (Snowball) e.getDamager();
            if (f.getShooter() instanceof Player) {
                Player shooter = (Player) f.getShooter();
                if (shooter.getItemInHand().equals(Laucer())) {
                    e.setDamage(10.0);


                }
            }
        }


    }


    @Deprecated
    public void onPlayerInteract2(PlayerInteractEvent e) {
        Player g = e.getPlayer();

        if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && g.getItemInHand().equals(Laucer())) {
            e.getPlayer().launchProjectile(Snowball.class);

        }


    }


    @Deprecated
    @EventHandler
    public void onEntityDamageSilverOblivion(EntityDamageByEntityEvent e) {

        if (e.getDamager() instanceof Snowball) {
            Snowball f = (Snowball) e.getDamager();
            if (f.getShooter() instanceof Player) {
                Player shooter = (Player) f.getShooter();
                if (shooter.getItemInHand().equals(SilverOblivion())) {
                    e.setDamage(10.0);


                }
            }
        }


    }


    @Deprecated
    public void onPlayerInteractSilverOblivion(PlayerInteractEvent e) {
        Player g = e.getPlayer();

        if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && g.getItemInHand().equals(SilverOblivion())) {
            e.getPlayer().launchProjectile(Snowball.class);

        }


    }


    @Deprecated
    @EventHandler
    public void onEntityDamagewithSpectra(EntityDamageByEntityEvent e) {

        if (e.getDamager() instanceof Fireball) {
            Fireball f = (Fireball) e.getDamager();
            if (f.getShooter() instanceof Player) {
                Player shooter = (Player) f.getShooter();
                if (shooter.getItemInHand().equals(Laucer())) {
                    e.setDamage(10.0);


                }
            }
        }


    }


    @Deprecated
    public void onPlayerInteractSpectra(PlayerInteractEvent e) {
        Player g = e.getPlayer();

        if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && g.getItemInHand().equals(Spectra())) {
            e.getPlayer().launchProjectile(Snowball.class);


        }
    }


    @Deprecated
    @EventHandler
    public void onEntityDamagewWithUltra(EntityDamageByEntityEvent e) {

        if (e.getDamager() instanceof WitherSkull) {
            WitherSkull f = (WitherSkull) e.getDamager();
            if (f.getShooter() instanceof Player) {
                Player shooter = (Player) f.getShooter();
                if (shooter.getItemInHand().equals(Laucer())) {
                    e.setDamage(10.0);


                }
            }
        }


    }


    @Deprecated
    public void onPlayerInteractUltra(PlayerInteractEvent e) {
        Player g = e.getPlayer();

        if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && g.getItemInHand().equals(Laucer())) {
            e.getPlayer().launchProjectile(WitherSkull.class);


        }
    }
}
