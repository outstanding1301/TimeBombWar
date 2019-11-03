/*     */ package Func;
/*     */ 
/*     */ import java.util.LinkedList;
/*     */ import java.util.Timer;
/*     */ import java.util.TimerTask;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.PlayerInventory;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ 
/*     */ public class TimerBoom
/*     */ {
/*     */   public static String Player;
/*     */   public static int Time;
/*  18 */   public static ItemStack bomb = new ItemStack(Material.TNT);
/*  19 */   public static Timer t = new Timer();
/*     */   
/*     */   public static void GiveBomb(Player p) {
/*  22 */     ItemMeta im = bomb.getItemMeta();
/*  23 */     im.setDisplayName(ChatColor.RED + "시한폭탄");
/*  24 */     LinkedList<String> lore = new LinkedList();
/*  25 */     lore.add("시간이 모두 지나면 폭발합니다.");
/*  26 */     im.setLore(lore);
/*  27 */     bomb.setItemMeta(im);
/*  28 */     p.getInventory().setItem(8, bomb);
/*     */   }
/*     */   
/*     */   public static void reset() {
/*  32 */     Player = "";
/*  33 */     Time = 0;
/*  34 */     bomb = new ItemStack(Material.TNT);
/*  35 */     t = new Timer();
/*     */   }
/*     */   
/*     */   public static int getTime() {
/*  39 */     return Time;
/*     */   }
/*     */   
/*  42 */   public static ItemStack getItem() { return bomb; }
/*     */   
/*     */   public static void setTime(int i) {
/*  45 */     Time = i;
/*     */   }
/*     */   
/*  48 */   public static String getPlayer() { return Player; }
/*     */   
/*     */   public static void setPlayer(Player p) {
/*  51 */     Player = p.getName();
/*     */   }
/*     */   
/*  54 */   public static void setPlayer(String p) { Player = p; }
/*     */   
/*     */   public static void PlayerChange(Player p)
/*     */   {
/*  58 */     Player = p.getName();
/*     */   }
/*     */   
/*     */   public static void Boom() {
/*  62 */     Player p = Bukkit.getPlayer(Player);
/*  63 */     if ((p != null) && 
/*  64 */       (p.isOnline())) {
/*  65 */       p.getWorld().createExplosion(p.getLocation(), 5.0F);
/*  66 */       p.damage(5000);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*  71 */   public static void newTimer() { t = new Timer(); }
/*     */   
/*     */   public static void StartTimer() {
/*  74 */     t.schedule(new TimerTask()
/*     */     {
/*     */       public void run()
/*     */       {
/*  78 */         if (TimerBoom.Time > 0) {
/*  79 */           TimerBoom.Time -= 1;
/*  80 */           TimerBoom.RefreshItemStack();
/*     */         }
/*     */         else {
/*  83 */           TimerBoom.Boom();
/*  84 */           Bukkit.broadcastMessage(ChatColor.RED + "시한폭탄이 폭발했습니다. 게임이 종료됩니다.");
/*  85 */           Data.Reset();
/*  86 */           cancel();
/*     */         }
/*     */       }
/*  89 */     }, 0L, 1000L);
/*     */   }
/*     */   
/*     */   public static void RefreshItemStack() {
/*  93 */     Player p = Bukkit.getPlayer(Player);
/*  94 */     if ((p != null) && 
/*  95 */       (p.isOnline())) {
/*  96 */       ItemMeta im = bomb.getItemMeta();
/*  97 */       im.setDisplayName(ChatColor.RED + "시한폭탄" + ChatColor.YELLOW + " (남은시간:" + Time + ")");
/*  98 */       LinkedList<String> lore = new LinkedList();
/*  99 */       lore.add("시간이 모두 지나면 폭발합니다.");
/* 100 */       im.setLore(lore);
/* 101 */       bomb.setItemMeta(im);
/* 102 */       p.getInventory().setItem(8, bomb);
/*     */     }
/*     */   }
/*     */ }


/* Location:              E:\플러그인\[마마]시한폭탄전쟁.jar!\Func\TimerBoom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */