import java.util.Random;
import java.util.Scanner;

public class Uranai {

  int point;
  int total;
  static Scanner sc;
  static Random rand;

  public static void main(String[] args) {
    sc = new Scanner( System.in );
    rand = new Random();


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

  public void Aries( int num ){
  }
  public void Taurus( int num ){
  }
  public void Gemini( int num ){
	    String seiza = "双子座";
	    switch( num ){

	      // case 1 = 一位の時のメッセージ
	      case 1:
	        System.out.println( num + "位" + seiza);
	        System.out.println("君が1位ということは、私は1位でないということ。");
	        System.out.println("許さない。足の裏、蚊に刺されろ！");
	        System.out.println("ラッキーポイント：『1位なんだから必要ないでしょ』");
	        System.out.println("");
	        break;
	      case 2:
	        System.out.println( num + "位" + seiza);
	        System.out.println("なんやかんやで1番いい順位なんじゃない？");
	        System.out.println("私は1位だけどな");
	        System.out.println("ラッキーポイント：『蚊取り線香』");
	        System.out.println("");
	        break;
	      case 3:
	        System.out.println( num + "位" + seiza);
	        System.out.println("ベスト3にランクインできたね。");
	        System.out.println("3の倍数だからアホにならなきゃ");
	        System.out.println("ラッキーポイント：『ムヒ』");
	        System.out.println("");
	        break;
	      case 4:
	        System.out.println( num + "位" + seiza);
	        System.out.println("4って『死』を連想させるよね♪");
	        System.out.println("死なないように気を付けて");
	        System.out.println("ラッキーポイント：『アースジェット』");
	        System.out.println("");
	        break;
	      case 5:
	        System.out.println( num + "位" + seiza);
	        System.out.println("これまた中途半端な順位");
	        System.out.println("結構反応に困る順位だよね");
	        System.out.println("ラッキーポイント：『虫よけスプレー』");
	        System.out.println("");
	        break;
	      case 6:
	        System.out.println( num + "位" + seiza);
	        System.out.println("ギリギリ半分より上だね");
	        System.out.println("ホッとしてたら束の間。蚊に刺されるかもよ");
	        System.out.println("ラッキーポイント：『蚊帳』");
	        System.out.println("");
	        break;
	      case 7:
	        System.out.println( num + "位" + seiza);
	        System.out.println("残念半分より下だ・・・");
	        System.out.println("でも、ラッキー７っていうじゃない？");
	        System.out.println("ラッキーポイント：『網戸』");
	        System.out.println("");
	        break;
	      case 8:
	        System.out.println( num + "位" + seiza);
	        System.out.println("この辺から低順位だね");
	        System.out.println("Ｏ型の人は蚊に刺されやすいというのは迷信らしいよ。");
	        System.out.println("ラッキーポイント：『モスキート音』");
	        System.out.println("");
	        break;
	      case 9:
	        System.out.println( num + "位" + seiza);
	        System.out.println("ギリギリ1桁だ。おめでとう！");
	        System.out.println("君より低い順位の人がいるんだら頑張れ！");
	        System.out.println("ラッキーポイント：『炭酸水』");
	        System.out.println("");
	        break;
	      case 10:
	        System.out.println( num + "位" + seiza);
	        System.out.println("蚊に刺されてるとき下手に抜こうとすると");
	        System.out.println("ますます痒くなるらしいよ");
	        System.out.println("ラッキーポイント：『黙って刺される』");
	        System.out.println("");
	        break;
	      case 11:
	        System.out.println( num + "位" + seiza);
	        System.out.println("ビール飲むと蚊に刺されやすくなるらしいよ");
	        System.out.println("理由は知らんけど");
	        System.out.println("ラッキーポイント：『ビール』");
	        System.out.println("");
	        break;
	      case 12:
	        System.out.println( num + "位" + seiza);
	        System.out.println("残念最下位いだ・・・");
	        System.out.println("そんな君は蚊に刺されて邪気を吸ってもらおう！");
	        System.out.println("ラッキーポイント：『河川敷』");
	        System.out.println("");
	    }
	    return;
  }
  public void Cancer( int num ){
  }
  public void Leo( int num ){
  }
  public void Virgo( int num ){
  }
  public void Libra( int num ){
  }
  public void Scorpio( int num ){
  }
  public void Sagittarius( int num ){
  }
  public void Capricorn( int num ){
  }
  public void Aquarius( int num ){
  }
  public void Pisces( int num ){
  }
}