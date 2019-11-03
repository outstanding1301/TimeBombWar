/*    */ package GameStart;
/*    */ 
/*    */ import Func.Data;
/*    */ import Func.TimerBoom;
/*    */ import java.util.LinkedList;
/*    */ import java.util.Random;
/*    */ import java.util.TimerTask;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ public class Starting
/*    */ {
/*    */   public static void Random()
/*    */   {
/* 17 */     Random r = new Random();
/* 18 */     int n = r.nextInt(Data.Players.size());
/* 19 */     TimerBoom.setPlayer((String)Data.Players.get(n));
/* 20 */     TimerBoom.GiveBomb(Bukkit.getPlayer((String)Data.Players.get(n)));
/* 21 */     Bukkit.getPlayer((String)Data.Players.get(n)).sendMessage(ChatColor.RED + "당신에게 폭탄이 주어졌습니다. 폭탄을 들고 타인을 공격하면 폭탄을 넘깁니다.");
/* 22 */     Bukkit.getPlayer((String)Data.Players.get(n)).sendMessage(ChatColor.RED + "폭탄은 5분 뒤 폭발합니다.");
/*    */   }
/*    */   
/* 25 */   public static void ReadPlayer() { Player[] aPlayer = Bukkit.getOnlinePlayers();
/* 26 */     Player[] arrayOfPlayer1 = aPlayer;int j = aPlayer.length; for (int i = 0; i < j; i++) { Player pp = arrayOfPlayer1[i];
/* 27 */       if (!pp.getName().equalsIgnoreCase(Data.Koyeyu)) {
/* 28 */         Data.Players.add(pp.getName());
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public static class Start extends TimerTask {
/* 34 */     private int a = 0;
/*    */     
/*    */     public void run() {
/* 37 */       if (!Data.Start) {
/* 38 */         Data.Reset();
/* 39 */         cancel();
/*    */       }
/* 41 */       switch (this.a) {
/* 42 */       case 1:  Bukkit.broadcastMessage(ChatColor.GREEN + "헝그리앱 TV 마음대로 마인크래프트" + ChatColor.RED + " 시한폭탄 전쟁");
/* 43 */         Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "──────────────────");
/* 44 */         Bukkit.broadcastMessage(ChatColor.AQUA + "제작자 : 염료");
/* 45 */         Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + " ♥뷜랑♥");
/* 46 */         break;
/*    */       case 5: 
/* 48 */         Data.candamage = true;
/* 49 */         Starting.ReadPlayer();
/* 50 */         Bukkit.broadcastMessage(ChatColor.RED + "누군가에게 폭탄이 주어졌습니다.");
/* 51 */         Bukkit.broadcastMessage(ChatColor.ITALIC + ChatColor.RED + "게임이 시작됩니다.");
/*    */         
/* 53 */         Starting.Random();
/* 54 */         TimerBoom.setTime(300);
/* 55 */         TimerBoom.StartTimer();
/* 56 */         Data.Start2 = true;
/* 57 */         cancel();
/*    */       }
/*    */       
/* 60 */       this.a = (this.a + 1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              E:\플러그인\[마마]시한폭탄전쟁.jar!\GameStart\Starting.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */