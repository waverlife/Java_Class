// Class_Override_Base.java
class Class_Override_Base {
   public static void main(String[] args)   {
 	BaseBoll_Payer  P1 = new BaseBoll_Payer () ;
 	P1.Walk  ( "20Km" ) ;
	P1.Speak( "こんにちは" ) ;
	P1.Strike( "二塁打" );
   }
}

class BaseBoll_Payer extends Human {
    public BaseBoll_Payer() {	// コンストラクタ
             System.out.println( "野球選手"  ); 
    }
   
   public void Strike ( String Stk ) {
         System.out.println( "打つ："  + Stk );
   }
   public void Walk( String Spd ) {
         System.out.println( "走る：" + Spd );
   }
}

class Human {
   public Human () {	
     // コンストラクタ
   }
   
   public void Walk( String Spd ) {
         System.out.println( "歩く：" + Spd );
   }
   
   public void Speak(String Spk ) {
         System.out.println( "話す：" + Spk );
   }
}

