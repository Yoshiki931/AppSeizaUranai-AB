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
    System.out.println( num + "位：かに座");
    switch( num ){
      case 1:
        System.out.println("仲の良い友人がカニ食べ放題に連れて行ってくれるでしょう");
        System.out.println("");
        break;
      case 2:
        System.out.println("両親がカニを送ってくれることでしょう");
        System.out.println("");
        break;
      case 3:
        System.out.println("くじ引きでカニが当たることでしょう");
        System.out.println("");
        break;
      case 4:
        System.out.println("人づてに面倒な依頼があるかも。金銭関係はキッパリ断って");
        System.out.println("");
        break;
      case 5:
        System.out.println("顔色が悪くなっていませんか。健康美人を目指しましょう。");
        System.out.println("");
        break;
      case 6:
        System.out.println("対人面では、思いがけない人と再会する暗示があります");
        System.out.println("");
        break;
      case 7:
        System.out.println("めげずに長期的戦略を立て、目標達成を目指しましょう");
        System.out.println("");
        break;
      case 8:
        System.out.println("現実をシビアに認識するのは悪いことではありません");
        System.out.println("");
        break;
      case 9:
        System.out.println("現実の厳しさに疲れたら、昔の友人に連絡を");
        System.out.println("");
        break;
      case 10:
        System.out.println("理想と現実の差を思い知らされる日");
        System.out.println("");
        break;
      case 11:
        System.out.println("甘い夢に酔っていると冷水をかけられてしまいそう");
        System.out.println("");
        break;
      case 12:
        System.out.println("やり残したことがあれば、今日の内に整理しておきましょう");
        System.out.println("");
    }
    System.out.println("");
    return;
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
  }
  public static void Aquarius( int num ){
  }
  public void Pisces( int num ){
  }
}