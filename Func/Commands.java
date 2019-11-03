/*    */ package Func;
/*    */ 
/*    */ import java.util.Timer;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Commands
/*    */ {
/*    */   public static void Start(Player p)
/*    */   {
/* 12 */     if (Data.Start) {
/* 13 */       Func.EMessage(p, "이미 게임이 시작했습니다.");
/* 14 */       return;
/*    */     }
/* 16 */     Data.Start = true;
/* 17 */     Timer timer = new Timer();
/* 18 */     timer.schedule(new GameStart.Starting.Start(), 1000L, 1000L);
/*    */   }
/*    */   
/*    */   public static void Stop(Player p) {
/* 22 */     if (!Data.Start) {
/* 23 */       Func.EMessage(p, "게임 진행중이 아닙니다.");
/* 24 */       return;
/*    */     }
/* 26 */     Bukkit.broadcastMessage(ChatColor.RED + "게임이 중지되었습니다. 다시 시작해주세요.");
/* 27 */     Data.Reset();
/*    */   }
/*    */   
/* 30 */   public static void inv(Player p) { if (Data.candamage) {
/* 31 */       Bukkit.broadcastMessage(ChatColor.GOLD + "무적이 적용됩니다.");
/* 32 */       Data.candamage = false;
/* 33 */       return;
/*    */     }
/* 35 */     Bukkit.broadcastMessage(ChatColor.GOLD + "무적이 해제됩니다.");
/* 36 */     Data.candamage = true;
/*    */   }
/*    */ }


/* Location:              E:\플러그인\[마마]시한폭탄전쟁.jar!\Func\Commands.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */