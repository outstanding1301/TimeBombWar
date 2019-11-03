/*    */ package Func;
/*    */ 
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.entity.Item;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.block.BlockPlaceEvent;
/*    */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*    */ import org.bukkit.event.entity.EntityDamageEvent;
/*    */ import org.bukkit.event.inventory.InventoryClickEvent;
/*    */ import org.bukkit.event.player.PlayerDropItemEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.PlayerInventory;
/*    */ import org.bukkit.inventory.meta.ItemMeta;
/*    */ 
/*    */ public class event
/*    */   implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public static void onDamagePlayer(EntityDamageByEntityEvent event)
/*    */   {
/* 24 */     if (((event.getEntity() instanceof Player)) && ((event.getDamager() instanceof Player))) {
/* 25 */       Player k = (Player)event.getEntity();
/* 26 */       Player p = (Player)event.getDamager();
/* 27 */       if ((Data.Start2) && 
/* 28 */         (TimerBoom.getPlayer().equalsIgnoreCase(p.getName())) && 
/* 29 */         (p.getItemInHand().hasItemMeta()) && 
/* 30 */         (p.getItemInHand().getItemMeta().getDisplayName().startsWith(ChatColor.RED + "시한폭탄"))) {
/* 31 */         p.getInventory().setItemInHand(new ItemStack(0));
/* 32 */         p.updateInventory();
/* 33 */         TimerBoom.PlayerChange(k);
/* 34 */         Bukkit.broadcastMessage(ChatColor.RED + "시한폭탄의 주인이 바뀌었습니다.");
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @EventHandler
/*    */   public static void onDamage(EntityDamageEvent event)
/*    */   {
/* 46 */     if (!Data.candamage) {
/* 47 */       event.setCancelled(true);
/*    */     }
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public static void onDrop(PlayerDropItemEvent e) {
/* 53 */     if ((e.getItemDrop().getItemStack().hasItemMeta()) && 
/* 54 */       (e.getItemDrop().getItemStack().getItemMeta().getDisplayName().startsWith(ChatColor.RED + "시한폭탄")) && (TimerBoom.getPlayer().equalsIgnoreCase(e.getPlayer().getName()))) {
/* 55 */       e.getItemDrop().remove();
/*    */     }
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public static void onPla(BlockPlaceEvent e)
/*    */   {
/* 62 */     if ((e.getPlayer().getItemInHand().hasItemMeta()) && 
/* 63 */       (e.getPlayer().getItemInHand().getItemMeta().getDisplayName().startsWith(ChatColor.RED + "시한폭탄")) && (TimerBoom.getPlayer().equalsIgnoreCase(e.getPlayer().getName()))) {
/* 64 */       e.setCancelled(true);
/*    */     }
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public static void onClick(InventoryClickEvent e)
/*    */   {
/* 71 */     if ((e.getCurrentItem().hasItemMeta()) && 
/* 72 */       (e.getCurrentItem().getItemMeta().getDisplayName().startsWith(ChatColor.RED + "시한폭탄"))) {
/* 73 */       e.setCancelled(true);
/*    */     }
/*    */   }
/*    */ }


/* Location:              E:\플러그인\[마마]시한폭탄전쟁.jar!\Func\event.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */