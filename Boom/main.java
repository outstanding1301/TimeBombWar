/*    */ package Boom;
/*    */ 
/*    */ import Func.Commands;
/*    */ import Func.Data;
/*    */ import Func.Func;
/*    */ import Func.event;
/*    */ import java.util.logging.Logger;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Server;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.plugin.PluginManager;
/*    */ 
/*    */ public class main extends org.bukkit.plugin.java.JavaPlugin
/*    */ {
/* 17 */   Logger log = Logger.getLogger("Minecraft");
/*    */   
/*    */   public void onEnable() {
/* 20 */     this.log.info("시한폭탄전쟁");
/* 21 */     this.log.info("──────────────────");
/* 22 */     this.log.info("제작:염료");
/* 23 */     getServer().getPluginManager().registerEvents(new event(), this);
/*    */   }
/*    */   
/*    */   public void onDisable() {
/* 27 */     this.log.info("붐붐  플러그인이 종료됩니다.");
/* 28 */     Data.Reset();
/*    */   }
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
/*    */   {
/* 33 */     Player p = (Player)sender;
/* 34 */     if (label.equalsIgnoreCase("bb")) {
/* 35 */       if (args.length == 1) {
/* 36 */         if (args[0].equalsIgnoreCase("start")) {
/* 37 */           if (!p.isOp()) {
/* 38 */             Func.EMessage(p, "당신은 관리자가 아닙니다.");
/* 39 */             return true;
/*    */           }
/* 41 */           Commands.Start(p);
/*    */         }
/* 43 */         else if (args[0].equalsIgnoreCase("stop")) {
/* 44 */           if (!p.isOp()) {
/* 45 */             Func.EMessage(p, "당신은 관리자가 아닙니다.");
/* 46 */             return true;
/*    */           }
/* 48 */           Commands.Stop(p);
/*    */         }
/* 50 */         else if (args[0].equalsIgnoreCase("inv")) {
/* 51 */           if (!p.isOp()) {
/* 52 */             Func.EMessage(p, "당신은 관리자가 아닙니다.");
/* 53 */             return true;
/*    */           }
/* 55 */           Commands.inv(p);
/*    */         }
/* 57 */         return true;
/*    */       }
/*    */       
/* 60 */       p.sendMessage(ChatColor.YELLOW + "：" + ChatColor.RED + "시한폭탄전쟁 명령어");
/* 61 */       p.sendMessage(ChatColor.GOLD + "--------------------------");
/* 62 */       if (p.isOp()) {
/* 63 */         p.sendMessage(ChatColor.AQUA + "/bb start - 게임을 시작합니다.");
/* 64 */         p.sendMessage(ChatColor.AQUA + "/bb stop - 게임을 종료합니다.");
/* 65 */         p.sendMessage(ChatColor.AQUA + "/bb inv - 초반 무적을 해제합니다. 다시 치면 적용됩니다.");
/*    */       }
/* 67 */       return true;
/*    */     }
/*    */     
/* 70 */     return true;
/*    */   }
/*    */ }


/* Location:              E:\플러그인\[마마]시한폭탄전쟁.jar!\Boom\main.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */