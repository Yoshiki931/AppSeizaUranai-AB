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
    	  System.out.println( num + "位" + seiza);
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
        break;
      case 3:
    	  System.out.println( num + "位" + seiza);
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
        break;
      case 4:
    	  System.out.println( num + "位" + seiza);
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
        break;
      case 5:
    	  System.out.println( num + "位" + seiza);
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
        break;
      case 6:
    	  System.out.println( num + "位" + seiza);
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
        break;
      case 7:
    	  System.out.println( num + "位" + seiza);
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
        break;
      case 8:
    	  System.out.println( num + "位" + seiza);
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
        break;
      case 9:
    	  System.out.println( num + "位" + seiza);
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
        break;
      case 10:
    	  System.out.println( num + "位" + seiza);
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
        break;
      case 11:
    	  System.out.println( num + "位" + seiza);
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
        break;
      case 12:
    	  System.out.println( num + "位" + seiza);
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
    }
    return;
  }
  public void Taurus( int num ){
  	System.out.println( num + "位：牡牛座");
	switch( num ){
	      case 1:
	        System.out.println("素晴らしくカンがいい日。");
	        System.out.println("自分を信じて直感で行動しよう。");
	        System.out.println("ラッキーポイント：アロマオイル");
	        System.out.println("");
	        break;
	      case 2:
	    	  System.out.println("あなたの持つ感受性が注目される日。");
	    	  System.out.println("作品作りをしてるなら発表しよう。");
	    	  System.out.println("ラッキーポイント：サングラス");
	    	  System.out.println("");
	        break;
	      case 3:
	    	  System.out.println("ユニークな人との出会いがありそう。");
	    	  System.out.println("今まで知らなかったものの見方を教わりそうだよ。");
	    	  System.out.println("ラッキーポイント：アイシャドウ");
	    	  System.out.println("");
	        break;
	      case 4:
	    	  System.out.println("直感が鋭くなりそうな一日。");
	    	  System.out.println("目に見えない世界に興味を持ちやすい日なので、占いもはまるよ。");
	    	  System.out.println("ラッキーポイント：時計");
	    	  System.out.println("");
	        break;
	      case 5:
	    	  System.out.println("雑誌をチェックして、映画やコンサート、アート系の展覧会に出かけよう。");
	    	  System.out.println("いい刺激を受けそう。");
	    	  System.out.println("ラッキーポイント：ブランド品");
	    	  System.out.println("");
	        break;
	      case 6:
	 
	    	  System.out.println("カルチャーで感動気分を味わおう。");
	    	  System.out.println("映画ならアクションものを。");
	    	  System.out.println("ラッキーポイント：鳥かご");
	    	  System.out.println("");
	        break;
	      case 7:
	    	  System.out.println("頭でばかり考えようとすると、本当のことが分からなくなりそう。");
	    	  System.out.println("直感を信じると運気アップ。");
	    	  System.out.println("ラッキーポイント：バッグ");
	    	  System.out.println("");
	        break;
	      case 8:
	    	  System.out.println("感情の浮き沈みが激しい今日のあなた。");
	    	  System.out.println("音楽を聴いてリラックスを。");
	    	  System.out.println("ラッキーポイント：カステラ");
	    	  System.out.println("");
	        break;
	      case 9:
	    	  System.out.println("運気はやや不安定。");
	    	  System.out.println("いい加減な人に振り回されるかも。");
	    	  System.out.println("ラッキーポイント：写真");
	    	  System.out.println("");
	        break;
	      case 10:
	    	  System.out.println("わけもなく不安になりやすい日。");
	    	  System.out.println("焦って行動すると混乱しそう。");
	    	  System.out.println("ラッキーポイント：掃除機");
	    	  System.out.println("");
	        break;
	      case 11:
	    	  System.out.println("理想と現実のギャップに苦しみそう。");
	    	  System.out.println("一足飛びに夢に突き進む前に、足元を固めよう。");
	    	  System.out.println("ラッキーポイント：入浴剤");
	    	  System.out.println("");
	        break;
	      case 12:
	    	  System.out.println("スッキリしない出来事が多く落ち着かない日。");
	    	  System.out.println("悩むよりも音楽を聴いて気分転換を図ろう。");
	    	  System.out.println("ラッキーポイント：香水");
	    	  System.out.println("");
	    }
	    return;
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
  public void Leo( int num ){
	  String seiza = "獅子座";
	    switch( num ){
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
  public static void Virgo( int num ){
  }
  public void Libra( int num ){
	  String seiza = "いて座";
	    switch( num ){
	      case 1:
	        System.out.println( num + "位" + seiza);
	        System.out.println("恋愛運が絶頂！");
	        System.out.println("運命の人に出会えるかも！！");
	        System.out.println("ラッキーポイント：『アンゴラうさぎの帽子』");
	        System.out.println("");
	        break;
	      case 2:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("運気が最高！");
		        System.out.println("今日のひきの強さは過去最高レベル！！");
		        System.out.println("ラッキーポイント：『黒縁の眼鏡』");
		        System.out.println("");
	        break;
	      case 3:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("仕事運が良いです");
		        System.out.println("悩んでいた問題が解決するかも！？");
		        System.out.println("ラッキーポイント：『寺やる第一話』");
		        System.out.println("");
	        break;
	      case 4:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("事故運が良いです");
		        System.out.println("交通量の多いところでは気を付けましょう");
		        System.out.println("ラッキーポイント：『スロット』");
		        System.out.println("");
	        break;
	      case 5:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("何もかもうまくいかない一日");
		        System.out.println("癒されるものを見て切り替えよう！");
		        System.out.println("ラッキーパーソン：『香風智乃』");
		        System.out.println("");
	        break;
	      case 6:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("何もかもうまくいかない一日");
		        System.out.println("癒されるものを見て切り替えよう！");
		        System.out.println("ラッキーパーソン：『香風智乃』");
		        System.out.println("");
	        break;
	      case 7:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("何もかもうまくいかない一日");
		        System.out.println("癒されるものを見て切り替えよう！");
		        System.out.println("ラッキーパーソン：『香風智乃』");
		        System.out.println("");
	        break;
	      case 8:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("何もかもうまくいかない一日");
		        System.out.println("癒されるものを見て切り替えよう！");
		        System.out.println("ラッキーパーソン：『香風智乃』");
		        System.out.println("");
	        break;
	      case 9:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("何もかもうまくいかない一日");
		        System.out.println("癒されるものを見て切り替えよう！");
		        System.out.println("ラッキーパーソン：『香風智乃』");
		        System.out.println("");
	        break;
	      case 10:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("何もかもうまくいかない一日");
		        System.out.println("癒されるものを見て切り替えよう！");
		        System.out.println("ラッキーパーソン：『香風智乃』");
		        System.out.println("");
	        break;
	      case 11:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("何もかもうまくいかない一日");
		        System.out.println("癒されるものを見て切り替えよう！");
		        System.out.println("ラッキーパーソン：『香風智乃』");
		        System.out.println("");
	        break;
	      case 12:
	    	  System.out.println( num + "位" + seiza);
		        System.out.println("何もかもうまくいかない一日");
		        System.out.println("癒されるものを見て切り替えよう！");
		        System.out.println("ラッキーパーソン：『香風智乃』");
		        System.out.println("");
	    }
	    return;
  }
  public static void Scorpio( int num ){
	  //みっちー
  }
  public void Sagittarius( int num ){
	  String seiza = "射手座";
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
    	  System.out.println( num + "位" + seiza);
          System.out.println("故意のビッグチャンス到来でモテモテ！");
          System.out.println("気になる人には積極的なアピールを！");
          System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
          System.out.println("");
        break;
      case 3:
    	  System.out.println( num + "位" + seiza);
          System.out.println("故意のビッグチャンス到来でモテモテ！");
          System.out.println("気になる人には積極的なアピールを！");
          System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
          System.out.println("");
        break;
      case 4:
    	  System.out.println( num + "位" + seiza);
          System.out.println("故意のビッグチャンス到来でモテモテ！");
          System.out.println("気になる人には積極的なアピールを！");
          System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
          System.out.println("");
        break;
      case 5:
    	  System.out.println( num + "位" + seiza);
          System.out.println("故意のビッグチャンス到来でモテモテ！");
          System.out.println("気になる人には積極的なアピールを！");
          System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
          System.out.println("");
        break;
      case 6:
    	  System.out.println( num + "位" + seiza);
          System.out.println("故意のビッグチャンス到来でモテモテ！");
          System.out.println("気になる人には積極的なアピールを！");
          System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
          System.out.println("");
        break;
      case 7:
    	  System.out.println( num + "位" + seiza);
          System.out.println("故意のビッグチャンス到来でモテモテ！");
          System.out.println("気になる人には積極的なアピールを！");
          System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
          System.out.println("");
        break;
      case 8:
    	  System.out.println( num + "位" + seiza);
          System.out.println("故意のビッグチャンス到来でモテモテ！");
          System.out.println("気になる人には積極的なアピールを！");
          System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
          System.out.println("");
        break;
      case 9:
    	  System.out.println( num + "位" + seiza);
          System.out.println("故意のビッグチャンス到来でモテモテ！");
          System.out.println("気になる人には積極的なアピールを！");
          System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
          System.out.println("");
        break;
      case 10:
    	  System.out.println( num + "位" + seiza);
          System.out.println("故意のビッグチャンス到来でモテモテ！");
          System.out.println("気になる人には積極的なアピールを！");
          System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
          System.out.println("");
        break;
      case 11:
    	  System.out.println( num + "位" + seiza);
          System.out.println("故意のビッグチャンス到来でモテモテ！");
          System.out.println("気になる人には積極的なアピールを！");
          System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
          System.out.println("");
        break;
      case 12:
    	  System.out.println( num + "位" + seiza);
          System.out.println("やけどの恐れあり");
          System.out.println("気を付けておきましょう。");
          System.out.println("ラッキーポイント：『手切れ金』");
          System.out.println("");
         break;
    }
    return;
  }
  public static void Capricorn( int num ){
  }
  public static void Aquarius( int num ){
  }
  public void Pisces( int num ){
	  String seiza = "うお座";
	    switch( num ){

	      // case 1 = 一位の時のメッセージ
	      case 1:
	    	  System.out.println( num + "位" + seiza);
	          System.out.println("魅力あふれる笑顔で人気急上昇。自信のあるジャンルでアピール。");
	          System.out.println("コミュニケーションが弾む");
	          System.out.println("ラッキーポイント：『熱帯魚の画像』");
	          System.out.println("");
	        break;
	      case 2:
	    	  System.out.println( num + "位" + seiza);
	          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
	          System.out.println("コミュニケーションを意識して");
	          System.out.println("ラッキーポイント：『変顔の写真』");
	          System.out.println("");
	        break;
	      case 3:
	    	  System.out.println( num + "位" + seiza);
	          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
	          System.out.println("コミュニケーションを意識して");
	          System.out.println("ラッキーポイント：『変顔の写真』");
	          System.out.println("");
	        break;
	      case 4:
	    	  System.out.println( num + "位" + seiza);
	          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
	          System.out.println("コミュニケーションを意識して");
	          System.out.println("ラッキーポイント：『変顔の写真』");
	          System.out.println("");
	        break;
	      case 5:
	    	  System.out.println( num + "位" + seiza);
	          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
	          System.out.println("コミュニケーションを意識して");
	          System.out.println("ラッキーポイント：『変顔の写真』");
	          System.out.println("");
	        break;
	      case 6:
	    	  System.out.println( num + "位" + seiza);
	          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
	          System.out.println("コミュニケーションを意識して");
	          System.out.println("ラッキーポイント：『変顔の写真』");
	          System.out.println("");
	        break;
	      case 7:
	    	  System.out.println( num + "位" + seiza);
	          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
	          System.out.println("コミュニケーションを意識して");
	          System.out.println("ラッキーポイント：『変顔の写真』");
	          System.out.println("");
	        break;
	      case 8:
	    	  System.out.println( num + "位" + seiza);
	          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
	          System.out.println("コミュニケーションを意識して");
	          System.out.println("ラッキーポイント：『変顔の写真』");
	          System.out.println("");
	        break;
	      case 9:
	    	  System.out.println( num + "位" + seiza);
	          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
	          System.out.println("コミュニケーションを意識して");
	          System.out.println("ラッキーポイント：『変顔の写真』");
	          System.out.println("");
	        break;
	      case 10:
	    	  System.out.println( num + "位" + seiza);
	          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
	          System.out.println("コミュニケーションを意識して");
	          System.out.println("ラッキーポイント：『変顔の写真』");
	          System.out.println("");
	        break;
	      case 11:
	    	  System.out.println( num + "位" + seiza);
	          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
	          System.out.println("コミュニケーションを意識して");
	          System.out.println("ラッキーポイント：『変顔の写真』");
	          System.out.println("");
	        break;
	      case 12:
	    	  System.out.println( num + "位" + seiza);
	          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
	          System.out.println("コミュニケーションを意識して");
	          System.out.println("ラッキーポイント：『変顔の写真』");
	          System.out.println("");
	    }
  }
}
