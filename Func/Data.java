/*    */ package Func;
/*    */ 
/*    */ import java.util.LinkedList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Data
/*    */ {
/* 13 */   public static boolean Start = false;
/* 14 */   public static boolean Start2 = false;
/* 15 */   public static String Koyeyu = null;
/* 16 */   public static boolean candamage = true;
/* 17 */   public static LinkedList<String> Players = new LinkedList();
/* 18 */   public static LinkedList<String> Out = new LinkedList();
/* 19 */   public static LinkedList<String> PNT = new LinkedList();
/*    */   
/*    */   public static void Reset() {
/* 22 */     Start = false;
/* 23 */     Start2 = false;
/* 24 */     Players.clear();
/* 25 */     Koyeyu = null;
/* 26 */     Out.clear();
/* 27 */     PNT.clear();
/* 28 */     TimerBoom.reset();
/*    */   }
/*    */ }


/* Location:              E:\플러그인\[마마]시한폭탄전쟁.jar!\Func\Data.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */