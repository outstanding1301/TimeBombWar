/*    */ package Func;
/*    */ 
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Func
/*    */ {
/*    */   public static void EMessage(Player p, String s)
/*    */   {
/*  9 */     p.sendMessage(org.bukkit.ChatColor.RED + s);
/*    */   }
/*    */   
/* 12 */   public static void IMessage(Player p, String s) { p.sendMessage(org.bukkit.ChatColor.GREEN + s); }
/*    */   
/*    */ 
/* 15 */   public static void HMessage(Player p, String s) { p.sendMessage(org.bukkit.ChatColor.GOLD + s); }
/*    */   
/*    */   public static void SHMsg(String s) {
/* 18 */     Player p = org.bukkit.Bukkit.getPlayer(Data.Koyeyu);
/* 19 */     p.sendMessage(s);
/*    */   }
/*    */ }


/* Location:              E:\플러그인\[마마]시한폭탄전쟁.jar!\Func\Func.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */