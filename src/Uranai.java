import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Uranai {

  int point;
  int total;
  static Scanner sc;
  static Random rand;

  public static void main(String[] args) {
    String constellations[] = {"Aries" , "Taurus" , "Gemini" , "Cancer" ,
        "Leo" , "Virgo" , "Libra" , "Scorpio" , "Sagittarius" , "Capricorn" ,
        "Aquarius" , "Pisces"};

    int randomBox;
    ArrayList<Integer>constellationRank = new ArrayList<Integer>();

    sc = new Scanner( System.in );
    rand = new Random();

    // 順位決定
    for( int i = 0 ; i < constellations.length ; i++){
      randomBox = rand.nextInt(12);
      for( int j = 0 ; j < constellationRank.size(); j++){
        if( constellationRank.get( j ) == randomBox ){
          randomBox = rand.nextInt(12);
          j = -1;
        }
      }
    }

    // １位から１２位まで順番にメソッドを呼び出し表示する
    for( int i = 0 ; i < constellations.length ; i++){
      switch( constellationRank.indexOf( i ) ){
        case 0:
          Aries( i + 1);
          break;
        case 1:
          Taurus( i + 1);
          break;
        case 2:
          Gemini( i + 1);
          break;
        case 3:
          Cancer( i + 1);
          break;
        case 4:
          Leo( i + 1);
          break;
        case 5:
          Virgo( i + 1);
          break;
        case 6:
          Libra( i + 1);
          break;
        case 7:
          Scorpio( i + 1);
          break;
        case 8:
          Sagittarius( i + 1);
          break;
        case 9:
          Capricorn( i + 1);
          break;
        case 10:
          Aquarius( i + 1);
          break;
        case 11:
          Aries( i + 1);
      }
    }
  }

  /*
   * 【皆さんにお願いしたいこと】
   *  星座の順位（１～１２位）に応じて占い結果（文字）を表示する.
   *
   *  内容に関しては、好きにしてください。
   *  例を下に乗せておきます。
   *  コピーするなりして頑張ってください。
   *  内容に関して、迷った時はめざましテレビの占いでも参考にしてください。
   */

  public static void Aries( int num ){
    String seiza = "牡羊座";
    switch( num ){
      // case 1 = 一位の時のメッセージ
      case 1:
        System.out.println( num + "位" + seiza );
        System.out.println("恋のビッグチャンス到来でモテモテ！");
        System.out.println("気になる人には積極的なアピールを！");
        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
        System.out.println("");
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        break;
      case 5:
        break;
      case 6:
        break;
      case 7:
        break;
      case 8:
        break;
      case 9:
        break;
      case 10:
        break;
      case 11:
        break;
      case 12:
    }
    return;
  }
  public static void Taurus( int num ){
  }
  public static void Gemini( int num ){
  }
  public static void Cancer( int num ){

  }
  public static void Leo( int num ){
  }
  public static void Virgo( int num ){
  }
  public static void Libra( int num ){
  }
  public static void Scorpio( int num ){
  }
  public static void Sagittarius( int num ){
  }
  public static void Capricorn( int num ){
	  System.out.println( num + "位：やぎ座");
	    switch( num ){
	      case 1:
	        System.out.println("ぺかっ！１位はやぎ座のあなた！");
	        System.out.println("今まで貯めていたお金が倍以上になるかも！");
	        System.out.println("さぁ万馬券に１連単だ！");
	        System.out.println("ラッキースロット：g1優駿倶楽部");
	        break;
	      case 2:
	        System.out.println("おめでとう！２位はやぎ座のあなた！");
	        System.out.println("今ある財布の中身が倍になるかも！");
	        System.out.println("さぁジャグラーに投資だ！");
	        System.out.println("ラッキースロット：ファンキー");
	        break;
	      case 3:
	        System.out.println("おめでとう！３位はやぎ座のあなた！");
	        System.out.println("今日の金運は最高！！！雀荘にＧＯ！！ＧＯ！！");
	        System.out.println("ラッキースロット：麻雀物語");
	        break;
	      case 4:
	        System.out.println("おめでとう！４位はやぎ座のあなた！");
	        System.out.println("今日の仕事運は最高！！！適当に仕事しても大丈夫！");
	        System.out.println("ラッキースロット：サラリーマン金太郎");
	        break;
	      case 5:
	        System.out.println("おめでとう！5位はやぎ座のあなた！");
	        System.out.println("今日の恋愛運は最高！！！一人暮らしのあなた！管理人さんと何かあるかも！");
	        System.out.println("ラッキースロット：めぞん一刻");
	        break;
	      case 6:
	    	  System.out.println("おめでとう！6位はやぎ座のあなた！");
	          System.out.println("今日の健康運は最高！！！グリーンスムージーを１０杯飲もう！！！");
	          System.out.println("ラッキースロット：恵比寿マスカッツ");
	        break;
	      case 7:
	    	  System.out.println("おめでとう！7位はやぎ座のあなた！");
	          System.out.println("今日の結婚運は最高！！！運命の人に合うためにスロットをやめましょう！！");
	          System.out.println("ラッキースロット：冬のソナタ");
	        break;
	      case 8:
	    	  System.out.println("おめでとう！8位はやぎ座のあなた！");
	          System.out.println("今日の金運は微妙！！！あなたが設定６だと思ってる台は設定２です気を付けて！！");
	          System.out.println("ラッキースロット：グレートハナハナ");
	        break;
	      case 9:
	    	  System.out.println("おめでとう！9位はやぎ座のあなた！");
	          System.out.println("今日の仕事運は微妙！！！今日次第で仕事がクビになるかも！！");
	          System.out.println("ラッキースロット：押忍！サラリーマン番長！");
	        break;
	      case 10:
	    	  System.out.println("おめでとう！10位はやぎ座のあなた！");
	          System.out.println("今日の恋愛運は微妙！！！可愛そうだけど今日で別れるかも！気を付けて！");
	          System.out.println("ラッキースロット：ラブきゅーれ！");
	        break;
	      case 11:
	    	  System.out.println("おめでとう！11位はやぎ座のあなた！");
	          System.out.println("今日の健康運は最悪！！！ワンちゃん死ぬかも！！！");
	          System.out.println("ラッキースロット：ハーデス");
	        break;
	      case 12:
	    	  System.out.println("おめでとう！12位はやぎ座のあなた！");
	          System.out.println("今日の金運はごみ！！！仕事がクビになって地下帝国で働くかも！！！");
	          System.out.println("ラッキースロット：カイジ");
	    }
	    System.out.println("");
	    return;
  }
  public static void Aquarius( int num ){
  }
  public void Pisces( int num ){
  }
}