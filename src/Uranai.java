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
    String seiza = "牡羊座";
    switch( num ){

      // case 1 = 一位の時のメッセージ
      case 1:
        System.out.println( num + "位" + seiza);
        System.out.println("故意のビッグチャンス到来でモテモテ！");
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
  public void Taurus( int num ){
  }
  public void Gemini( int num ){
  }
  public void Cancer( int num ){
  }
  public void Leo( int num ){
	  String seiza = "獅子座";
	    switch( num ){

	      // case 1 = 一位の時のメッセージ
	      case 1:
	        System.out.println( num + "位" + seiza);
	        System.out.println("とにかく凄い一日！！");
	        System.out.println("何をしても成功します！！");
	        System.out.println("何事にもトライしましょう！！！");
	        System.out.println("ラッキーポイント：『借金をする勇気』");
	        System.out.println("(当社は一切の責任を負いません)");
	        break;
	      case 2:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("恋のビッグチャンス到来でモテモテ(笑)！");
		        System.out.println("気になる人には積極的なアピールを！");
		        System.out.println("ラッキーポイント：『お城みたいなホテル』");
		        System.out.println("(当社は一切の責任を負いません)");
	        break;
	      case 3:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("新境地を開くべき！");
		        System.out.println("マンネリを打破しましょう！");
		        System.out.println("ラッキーポイント：『路地裏のあぶないお店』");
		        System.out.println("");
	        break;
	      case 4:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("普通な一日");
		        System.out.println("特にありません");
		        System.out.println("特にありません");
		        System.out.println("ラッキーポイント：『特にありません』");
	        break;
	      case 5:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("ちょっと不幸な一日...");
		        System.out.println("道を歩いていたら躓いちゃうかも");
		        System.out.println("ラッキーポイント：『引きこもり』");
		        System.out.println("");
	        break;
	      case 6:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("何もうまくいかない一日...");
		        System.out.println("挑戦しても失敗するかも...");
		        System.out.println("ラッキーポイント：『ニート』");
		        System.out.println("");
	        break;
	      case 7:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("いつもの日常が大変なことに...！！");
		        System.out.println("一つの失敗からとんでもないことが起こりそう！！");
		        System.out.println("ラッキーポイント：『ヒモ』");
		        System.out.println("");
	        break;
	      case 8:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("ホントに何も起こらいない一日になりそう...？");
		        System.out.println("いつもの日常に疑問を感じるかも？");
		        System.out.println("ラッキーポイント：『自分の勘』");
		        System.out.println("");
	        break;
	      case 9:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("世紀末な一日になりそうッ！！");
		        System.out.println("貴様に死兆星が見えている！");
		        System.out.println("ラッキーポイント：『北斗神拳伝承者』");
		        System.out.println("");
	        break;
	      case 10:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("主人公な一日になりそう！");
		        System.out.println("でも出会う人すべて気持ち悪い見た目かも？");
		        System.out.println("ラッキーポイント：『受け入れる心』");
		        System.out.println("");
	        break;
	      case 11:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("とても不幸な一日になりそう！");
		        System.out.println("詩文の好きなものがことごとく謎の失踪を遂げそう？");
		        System.out.println("ラッキーポイント：『強靭な心』");
		        System.out.println("");
	        break;
	      case 12:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("今日死にまーーす！");
		        System.out.println("どうあがいても死にます！あきらめましょう！！");
		        System.out.println("ラッキーポイント：『悔いのない行動』");
		        System.out.println("");
	    }
	    return;
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