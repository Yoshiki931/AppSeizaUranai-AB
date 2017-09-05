import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Uranai {

  int point;
  int total;
  static Scanner sc;
  static Random rand;

  public static void main(String[] args) {
    String constellations[] = {"Aries" , "Taurus" , "Gemini" , "Cancer" , "Leo" , "Virgo" , "Libra" , "Scorpio" , "Sagittarius" , "Capricorn" , "Aquarius" , "Pisces"};
    int randomBox;

    sc = new Scanner( System.in );
    rand = new Random();
    Uranai uranai = new Uranai();

    //各星座の順位を保持する
    ArrayList<Integer>constellationRank = new ArrayList<Integer>();

    // 順位決定処理
    for( int i = 0 ; i < constellations.length ; i++){
      randomBox = rand.nextInt(12);

      // 生成した乱数が既存の順位と重複した時、乱数を再生成する
      for( int j = 0 ; j < constellationRank.size(); j++){
        if( constellationRank.get( j ) == randomBox ){
          randomBox = rand.nextInt(12);
          j = -1;
        }
      }
      // 各星座の順位を確定させる
      constellationRank.add( randomBox );
    }
    // １位から１２位まで順番にメソッドを呼び出し、各星座の順位に沿ったメッセージを表示
    for( int i = 0 ; i < constellations.length ; i++){
      switch( constellationRank.indexOf( i ) ){
        case 0:
          uranai.Aries( i + 1);
          break;
        case 1:
          uranai.Taurus( i + 1);
          break;
        case 2:
          uranai.Gemini( i + 1);
          break;
        case 3:
          uranai.Cancer( i + 1);
          break;
        case 4:
          uranai.Leo( i + 1);
          break;
        case 5:
          uranai.Virgo( i + 1);
          break;
        case 6:
          uranai.Libra( i + 1);
          break;
        case 7:
          uranai.Scorpio( i + 1);
          break;
        case 8:
          uranai.Sagittarius( i + 1);
          break;
        case 9:
          uranai.Capricorn( i + 1);
          break;
        case 10:
          uranai.Aquarius( i + 1);
          break;
        case 11:
          uranai.Pisces( i + 1);
      }
    }
  }

  public void Aries( int num ){
    String seiza = "牡羊座";
    System.out.println( num + "位：" + seiza );
    switch( num ){
      case 1:
        System.out.println("恋のビッグチャンス到来でモテモテ！");
        System.out.println("気になる人には積極的なアピールを！");
        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
        System.out.println("ただし、『茶色』に気を付けること");
        break;
      case 2:
        System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
        System.out.println("コミュニケーションを意識して");
        System.out.println("ラッキーポイント：『変顔の写真』");
        System.out.println("ただし、『小豆色』に気を付けること");
        break;
      case 3:
        System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
        System.out.println("コミュニケーションを意識して");
        System.out.println("ラッキーポイント：『変顔の写真』");
        System.out.println("ただし、『紫色』に気を付けること");
        break;
      case 4:
        System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
        System.out.println("コミュニケーションを意識して");
        System.out.println("ラッキーポイント：『変顔の写真』");
        System.out.println("ただし、『黄色』に気を付けること");
        break;
      case 5:
        System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
        System.out.println("コミュニケーションを意識して");
        System.out.println("ラッキーポイント：『変顔の写真』");
        System.out.println("ただし、『青色』に気を付けるこto");
        break;
      case 6:
        System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
        System.out.println("コミュニケーションを意識して");
        System.out.println("ラッキーポイント：『変顔の写真』");
        System.out.println("ただし、『赤色』に気を付けること");
        break;
      case 7:
        System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
        System.out.println("コミュニケーションを意識して");
        System.out.println("ラッキーポイント：『変顔の写真』");
        System.out.println("ただし、『マラソン』をすると運気アップ");
        break;
      case 8:
        System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
        System.out.println("コミュニケーションを意識して");
        System.out.println("ラッキーポイント：『変顔の写真』");
        System.out.println("ただし、『ベンチプレス』をすると運気アップ");
        break;
      case 9:
        System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
        System.out.println("コミュニケーションを意識して");
        System.out.println("ラッキーポイント：『変顔の写真』");
        System.out.println("ただし、『スクワット』をすると運気アップ");
        break;
      case 10:
        System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
        System.out.println("コミュニケーションを意識して");
        System.out.println("ラッキーポイント：『変顔の写真』");
        System.out.println("ただし、『背筋』をすると運気アップ");
        break;
      case 11:
        System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
        System.out.println("コミュニケーションを意識して");
        System.out.println("ラッキーポイント：『変顔の写真』");
        System.out.println("ただし、『腹筋』をすると運気アップ");
        break;
      case 12:
        System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
        System.out.println("コミュニケーションを意識して");
        System.out.println("ラッキーポイント：『変顔の写真』");
        System.out.println("ただし、『腕立て』をすると運気アップ");
    }
    System.out.println("");
    return;
  }
  public void Taurus( int num ){
    String seiza = "牡牛座";
    System.out.println( num + "位：" + seiza);
    switch( num ){
        case 1:
          System.out.println("素晴らしくカンがいい日。");
          System.out.println("自分を信じて直感で行動しよう。");
          System.out.println("ラッキーポイント：アロマオイル");
          System.out.println("ただし足元には気を付けて！");
          break;
        case 2:
          System.out.println("あなたの持つ感受性が注目される日。");
          System.out.println("作品作りをしてるなら発表しよう。");
          System.out.println("ラッキーポイント：サングラス");
          System.out.println("ただし日焼けには気を付けて！");
          break;
        case 3:
          System.out.println("ユニークな人との出会いがありそう。");
          System.out.println("今まで知らなかったものの見方を教わりそうだよ。");
          System.out.println("ラッキーポイント：アイシャドウ");
          System.out.println("ただし雨には気を付けて！");
          break;
        case 4:
          System.out.println("直感が鋭くなりそうな一日。");
          System.out.println("目に見えない世界に興味を持ちやすい日なので、占いもはまるよ。");
          System.out.println("ラッキーポイント：時計");
          System.out.println("ただし遅刻には気を付けて！");
          break;
        case 5:
          System.out.println("雑誌をチェックして、映画やコンサート、アート系の展覧会に出かけよう。");
          System.out.println("いい刺激を受けそう。");
          System.out.println("ラッキーポイント：ブランド品");
          System.out.println("ただしアクセサリーには気を付けて！");
          break;
        case 6:
          System.out.println("カルチャーで感動気分を味わおう。");
          System.out.println("映画ならアクションものを。");
          System.out.println("ラッキーポイント：鳥かご");
          System.out.println("ただしインコには気を付けて！");
          break;
        case 7:
          System.out.println("頭でばかり考えようとすると、本当のことが分からなくなりそう。");
          System.out.println("直感を信じると運気アップ。");
          System.out.println("ラッキーポイント：バッグ");
          System.out.println("ただし運動すると運気アップ！");
          break;
        case 8:
          System.out.println("感情の浮き沈みが激しい今日のあなた。");
          System.out.println("音楽を聴いてリラックスを。");
          System.out.println("ラッキーポイント：カステラ");
          System.out.println("ただし紅茶を飲むと運気アップ！");
          break;
        case 9:
          System.out.println("運気はやや不安定。");
          System.out.println("いい加減な人に振り回されるかも。");
          System.out.println("ラッキーポイント：写真");
          System.out.println("ただしインスタグラムに投稿すると運気アップ！");
          break;
        case 10:
          System.out.println("わけもなく不安になりやすい日。");
          System.out.println("焦って行動すると混乱しそう。");
          System.out.println("ラッキーポイント：掃除機");
          System.out.println("ただし部屋の衣替えをすると運気アップ！");
          break;
        case 11:
          System.out.println("理想と現実のギャップに苦しみそう。");
          System.out.println("一足飛びに夢に突き進む前に、足元を固めよう。");
          System.out.println("ラッキーポイント：入浴剤");
          System.out.println("ただしバスソルトを使うと運気アップ！");
          break;
        case 12:
          System.out.println("スッキリしない出来事が多く落ち着かない日。");
          System.out.println("悩むよりも音楽を聴いて気分転換を図ろう。");
          System.out.println("ラッキーポイント：香水");
          System.out.println("ただしハイブランドの香水だと運気アップ！");
      }
      System.out.println("");
      return;
  }
  public void Gemini( int num ){
      String seiza = "双子座";
      System.out.println( num + "位：" + seiza);
      switch( num ){
        case 1:
          System.out.println("君が1位ということは、私は1位でないということ。");
          System.out.println("許さない。足の裏、蚊に刺されろ！");
          System.out.println("ラッキーポイント：『1位なんだから必要ないでしょ』");
          break;
        case 2:
          System.out.println("なんやかんやで1番いい順位なんじゃない？");
          System.out.println("私は1位だけどな");
          System.out.println("ラッキーポイント：『蚊取り線香』");
          break;
        case 3:
          System.out.println("ベスト3にランクインできたね。");
          System.out.println("3の倍数だからアホにならなきゃ");
          System.out.println("ラッキーポイント：『ムヒ』");
          break;
        case 4:
          System.out.println("4って『死』を連想させるよね♪");
          System.out.println("死なないように気を付けて");
          System.out.println("ラッキーポイント：『アースジェット』");
          break;
        case 5:
          System.out.println("これまた中途半端な順位");
          System.out.println("結構反応に困る順位だよね");
          System.out.println("ラッキーポイント：『虫よけスプレー』");
          break;
        case 6:
          System.out.println("ギリギリ半分より上だね");
          System.out.println("ホッとしてたら束の間。蚊に刺されるかもよ");
          System.out.println("ラッキーポイント：『蚊帳』");
          break;
        case 7:
          System.out.println("残念半分より下だ・・・");
          System.out.println("でも、ラッキー７っていうじゃない？");
          System.out.println("ラッキーポイント：『網戸』");
          break;
        case 8:
          System.out.println("この辺から低順位だね");
          System.out.println("Ｏ型の人は蚊に刺されやすいというのは迷信らしいよ。");
          System.out.println("ラッキーポイント：『モスキート音』");
          break;
        case 9:
          System.out.println("ギリギリ1桁だ。おめでとう！");
          System.out.println("君より低い順位の人がいるんだら頑張れ！");
          System.out.println("ラッキーポイント：『炭酸水』");
          break;
        case 10:
          System.out.println("蚊に刺されてるとき下手に抜こうとすると");
          System.out.println("ますます痒くなるらしいよ");
          System.out.println("ラッキーポイント：『黙って刺される』");
          break;
        case 11:
          System.out.println("ビール飲むと蚊に刺されやすくなるらしいよ");
          System.out.println("理由は知らんけど");
          System.out.println("ラッキーポイント：『ビール』");
          break;
        case 12:
          System.out.println("残念最下位いだ・・・");
          System.out.println("そんな君は蚊に刺されて邪気を吸ってもらおう！");
          System.out.println("ラッキーポイント：『河川敷』");
      }
      System.out.println("");
      return;
  }
  public void Cancer( int num ){
    String seiza = "蟹座";
    System.out.println( num + "位：" + seiza);
    switch( num ){
      case 1:
        System.out.println("仲の良い友人がカニ食べ放題に連れて行ってくれるでしょう");
        break;
      case 2:
        System.out.println("両親がカニを送ってくれることでしょう");
        break;
      case 3:
        System.out.println("くじ引きでカニが当たることでしょう");
        break;
      case 4:
        System.out.println("人づてに面倒な依頼があるかも。金銭関係はキッパリ断って");
        break;
      case 5:
        System.out.println("顔色が悪くなっていませんか。健康美人を目指しましょう。");
        break;
      case 6:
        System.out.println("対人面では、思いがけない人と再会する暗示があります");
        break;
      case 7:
        System.out.println("めげずに長期的戦略を立て、目標達成を目指しましょう");
        break;
      case 8:
        System.out.println("現実をシビアに認識するのは悪いことではありません");
        break;
      case 9:
        System.out.println("現実の厳しさに疲れたら、昔の友人に連絡を");
        break;
      case 10:
        System.out.println("理想と現実の差を思い知らされる日");
        break;
      case 11:
        System.out.println("甘い夢に酔っていると冷水をかけられてしまいそう");
        break;
      case 12:
        System.out.println("やり残したことがあれば、今日の内に整理しておきましょう");
    }
    if( num < 7){
      System.out.println("ただし、重課金兵には気を付けること");
    }
    else{
      System.out.println("シャドウバースに100000円課金すると運気UP!");
    }
    System.out.println("");
    return;
  }
  public void Leo( int num ){
    String seiza = "獅子座";
    System.out.println( num + "位：" + seiza);
      switch( num ){
        case 1:
          System.out.println("とにかく凄い一日！！");
          System.out.println("何をしても成功します！！");
          System.out.println("何事にもトライしましょう！！！");
          System.out.println("ラッキーポイント：『借金をする勇気』");
          System.out.println("(当社は一切の責任を負いません)");
          break;
        case 2:
          System.out.println("恋のビッグチャンス到来でモテモテ(笑)！");
          System.out.println("気になる人には積極的なアピールを！");
          System.out.println("ラッキーポイント：『お城みたいなホテル』");
          System.out.println("(当社は一切の責任を負いません)");
          break;
        case 3:
          System.out.println("新境地を開くべき！");
          System.out.println("マンネリを打破しましょう！");
          System.out.println("ラッキーポイント：『路地裏のあぶないお店』");
          break;
        case 4:
          System.out.println("普通な一日");
          System.out.println("特にありません");
          System.out.println("特にありません");
          System.out.println("ラッキーポイント：『特にありません』");
          break;
        case 5:
          System.out.println("ちょっと不幸な一日...");
          System.out.println("道を歩いていたら躓いちゃうかも");
          System.out.println("ラッキーポイント：『引きこもり』");
          System.out.println("");
          break;
        case 6:
          System.out.println("何もうまくいかない一日...");
          System.out.println("挑戦しても失敗するかも...");
          System.out.println("ラッキーポイント：『ニート』");
          System.out.println("");
          break;
        case 7:
          System.out.println("いつもの日常が大変なことに...！！");
          System.out.println("一つの失敗からとんでもないことが起こりそう！！");
          System.out.println("ラッキーポイント：『ヒモ』");
          System.out.println("");
          break;
        case 8:
          System.out.println("ホントに何も起こらいない一日になりそう...？");
          System.out.println("いつもの日常に疑問を感じるかも？");
          System.out.println("ラッキーポイント：『自分の勘』");
          System.out.println("");
          break;
        case 9:
          System.out.println("世紀末な一日になりそうッ！！");
          System.out.println("貴様に死兆星が見えている！");
          System.out.println("ラッキーポイント：『北斗神拳伝承者』");
          System.out.println("");
          break;
        case 10:
          System.out.println("主人公な一日になりそう！");
          System.out.println("でも出会う人すべて気持ち悪い見た目かも？");
          System.out.println("ラッキーポイント：『受け入れる心』");
          System.out.println("");
          break;
        case 11:
          System.out.println("とても不幸な一日になりそう！");
          System.out.println("詩文の好きなものがことごとく謎の失踪を遂げそう？");
          System.out.println("ラッキーポイント：『強靭な心』");
          System.out.println("");
          break;
        case 12:
          System.out.println("今日死にまーーす！");
          System.out.println("どうあがいても死にます！あきらめましょう！！");
          System.out.println("ラッキーポイント：『悔いのない行動』");
          System.out.println("");
      }
      if( num < 7){
    	  System.out.println("調子に乗ると、痛い目見ますよ(byスタッフ)");
      }
      else{
    	  System.out.println("小五ロリと会うと運気UP");
      }
      System.out.println("");
      return;
  }
  public void Virgo( int num ){
	  String seiza = "おとめ座";
      System.out.println( num + "位：" + seiza );
		    switch( num ){
        case 1:
		        System.out.println("恋のビッグチャンス到来でモテモテ！");
		        System.out.println("気になる人には積極的なアピールを！");
		        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
		        System.out.println("ただしスズメバチにはきをつけること！！");
		        System.out.println("");
		        break;
		      case 2:
		        System.out.println("恋のビッグチャンス到来でモテモテ！");
		        System.out.println("気になる人には積極的なアピールを！");
		        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
		        System.out.println("ただしスズメバチにはきをつけること！！");
		        System.out.println("");
		        break;
		      case 3:
		        System.out.println("恋のビッグチャンス到来でモテモテ！");
		        System.out.println("気になる人には積極的なアピールを！");
		        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
		        System.out.println("ただしスズメバチにはきをつけること！！");
		        System.out.println("");
		        break;
		      case 4:
		        System.out.println("恋のビッグチャンス到来でモテモテ！");
		        System.out.println("気になる人には積極的なアピールを！");
		        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
		        System.out.println("ただしスズメバチにはきをつけること！！");
		        System.out.println("");
		        break;
		      case 5:
		        System.out.println("恋のビッグチャンス到来でモテモテ！");
		        System.out.println("気になる人には積極的なアピールを！");
		        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
		        System.out.println("ただしスズメバチにはきをつけること！！");
		        System.out.println("");
		        break;
		      case 6:
		        System.out.println("恋のビッグチャンス到来でモテモテ！");
		        System.out.println("気になる人には積極的なアピールを！");
		        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
		        System.out.println("ただしスズメバチにはきをつけること！！");
		        System.out.println("");
		        break;
		      case 7:
		        System.out.println("恋のビッグチャンス到来でモテモテ！");
		        System.out.println("気になる人には積極的なアピールを！");
		        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
		        System.out.println("ただし屈伸をすると運気アップ！！");
		        System.out.println("");
		        break;
		      case 8:
		        System.out.println("恋のビッグチャンス到来でモテモテ！");
		        System.out.println("気になる人には積極的なアピールを！");
		        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
		        System.out.println("ただし屈伸をすると運気アップ！！");
		        System.out.println("");
		        break;
		      case 9:
		        System.out.println("恋のビッグチャンス到来でモテモテ！");
		        System.out.println("気になる人には積極的なアピールを！");
		        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
		        System.out.println("ただし屈伸をすると運気アップ！！");
		        System.out.println("");
		        break;
		      case 10:
		        System.out.println("恋のビッグチャンス到来でモテモテ！");
		        System.out.println("気になる人には積極的なアピールを！");
		        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
		        System.out.println("ただし屈伸をすると運気アップ！！");
		        System.out.println("");
		        break;
		      case 11:
		        System.out.println("恋のビッグチャンス到来でモテモテ！");
		        System.out.println("気になる人には積極的なアピールを！");
		        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
		        System.out.println("ただし屈伸をすると運気アップ！！");
		        System.out.println("");
		        break;
		      case 12:
		        System.out.println("恋のビッグチャンス到来でモテモテ！");
		        System.out.println("気になる人には積極的なアピールを！");
		        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
		        System.out.println("ただし屈伸をすると運気アップ！！");
		        System.out.println("");
		    }
		    return;
  }
  public void Libra( int num ){
    String seiza = "いて座";
    System.out.println( num + "位：" + seiza);
      switch( num ){
        case 1:
          System.out.println("恋愛運が絶頂！");
          System.out.println("運命の人に出会えるかも！！");
          System.out.println("ラッキーポイント：『アンゴラうさぎの帽子』");
          System.out.println("ただしチノちゃんの可愛さには気を付けること");
          System.out.println("");
          break;
        case 2:
          System.out.println("運気が最高！");
          System.out.println("今日のひきの強さは過去最高レベル！！");
          System.out.println("ラッキーポイント：『黒縁の眼鏡』");
          System.out.println("ただしチノちゃんの可愛さには気を付けること");
          System.out.println("");
          break;
        case 3:
          System.out.println("仕事運が良いです");
          System.out.println("悩んでいた問題が解決するかも！？");
          System.out.println("ラッキーポイント：『寺やる第一話』");
          System.out.println("ただしチノちゃんの可愛さには気を付けること");
          System.out.println("");
          break;
        case 4:
          System.out.println("事故運が良いです");
          System.out.println("交通量の多いところでは気を付けましょう");
          System.out.println("ラッキーポイント：『スロット』");
          System.out.println("ただしチノちゃんの可愛さには気を付けること");
          System.out.println("");
          break;
        case 5:
          System.out.println("何もかもうまくいかない一日");
          System.out.println("癒されるものを見て切り替えよう！");
          System.out.println("ラッキーパーソン：『香風智乃』");
          System.out.println("ただしチノちゃんの可愛さには気を付けること");
          System.out.println("");
          break;
        case 6:
          System.out.println("何もかもうまくいかない一日");
          System.out.println("癒されるものを見て切り替えよう！");
          System.out.println("ラッキーパーソン：『香風智乃』");
          System.out.println("ただしチノちゃんの可愛さには気を付けること");
          System.out.println("");
          break;
        case 7:
          System.out.println("何もかもうまくいかない一日");
          System.out.println("癒されるものを見て切り替えよう！");
          System.out.println("ラッキーパーソン：『香風智乃』");
          System.out.println("ただし528Hzの動画を見ると運気アップ!");
          System.out.println("");
          break;
        case 8:
          System.out.println("何もかもうまくいかない一日");
          System.out.println("癒されるものを見て切り替えよう！");
          System.out.println("ラッキーパーソン：『香風智乃』");
          System.out.println("ただし528Hzの動画を見ると運気アップ!");
          System.out.println("");
          break;
        case 9:
          System.out.println("何もかもうまくいかない一日");
          System.out.println("癒されるものを見て切り替えよう！");
          System.out.println("ラッキーパーソン：『香風智乃』");
          System.out.println("ただし528Hzの動画を見ると運気アップ!");
          System.out.println("");
          break;
        case 10:
          System.out.println("何もかもうまくいかない一日");
          System.out.println("癒されるものを見て切り替えよう！");
          System.out.println("ラッキーパーソン：『香風智乃』");
          System.out.println("ただし528Hzの動画を見ると運気アップ!");
          System.out.println("");
          break;
        case 11:
          System.out.println("何もかもうまくいかない一日");
          System.out.println("癒されるものを見て切り替えよう！");
          System.out.println("ラッキーパーソン：『香風智乃』");
          System.out.println("ただし528Hzの動画を見ると運気アップ!");
          System.out.println("");
          break;
        case 12:
          System.out.println("何もかもうまくいかない一日");
          System.out.println("癒されるものを見て切り替えよう！");
          System.out.println("ラッキーパーソン：『香風智乃』");
          System.out.println("ただし528Hzの動画を見ると運気アップ!");
          System.out.println("");
      }
      return;
  }
  public void Scorpio( int num ){
    String seiza = "蠍座";
    System.out.println( num + "位：" + seiza);
      switch( num ){
        case 1:
          System.out.println("疲れ知らずで勝利を掴めそう。");
          System.out.println("好きな武器と飲み物で勝率がグンとＵＰ！");
          System.out.println("ラッキーポイント：『ドン勝』");
          System.out.println("ただしバーストの罠にはきをつけること！");
          break;
        case 2:
          System.out.println("物事が思い通りに進展。");
          System.out.println("イベントを計画して◎");
          System.out.println("ラッキーポイント：『トップ10にランクイン！』");
          System.out.println("ただし最終安地にはきをつけること！");
          break;
        case 3:
          System.out.println("偶然があなたの味方に…。");
          System.out.println("攻めの姿勢で実力を発揮。");
          System.out.println("ラッキーポイント：『キル厨』");
          System.out.println("ただしクソ芋にはきをつけること！");
          break;
        case 4:
          System.out.println("外出先で新しい出会いが。");
          System.out.println("いつもと違う視点がカギ。");
          System.out.println("ラッキーポイント：『FPP』");
          System.out.println("ただし酔いにはきをつけること！");
          break;
        case 5:
          System.out.println("アイディアがひらめく♪");
          System.out.println("仲間との連携がポイント。");
          System.out.println("ラッキーポイント：『蘇生』");
          System.out.println("ただし蘇生する順番にはきをつけること！");
          break;
        case 6:
          System.out.println("役立つ知識を得られそう。");
          System.out.println("SNSや生放送で情報収集。");
          System.out.println("ラッキーポイント：『ゴースティング』");
          System.out.println("ただしBANにはきをつけること！");
          break;
        case 7:
          System.out.println("疲れがたまりダウン寸前。");
          System.out.println("エナジードリンク飲んで体力を回復！");
          System.out.println("ラッキーポイント：『レッドブル』");
          System.out.println("ただしM249を拾うと運気アップ！");
          break;
        case 8:
          System.out.println("見えを張り財布がピンチ。");
          System.out.println("無駄遣いは絶対にヤメテ。");
          System.out.println("ラッキーポイント：『3300円』");
          System.out.println("ただしM24を拾うと運気アップ！");
          break;
        case 9:
          System.out.println("心ない発言に意気消沈…。");
          System.out.println("物事を深く考えず過ごす。");
          System.out.println("ラッキーポイント：『内部崩壊』");
          System.out.println("ただしグローザを拾うと運気アップ！");
          break;
        case 10:
          System.out.println("ささいな煽りにイライラ。");
          System.out.println("肩の力を抜いて行動して。");
          System.out.println("ラッキーポイント：『屈伸』");
          System.out.println("ただしトンプソンを拾うと運気アップ！");
          break;
        case 11:
          System.out.println("人間関係でトラブルに。");
          System.out.println("友達を頼り過ぎると×");
          System.out.println("ラッキーポイント：『solo』");
          System.out.println("ただしAWMを拾うと運気アップ！");
          break;
        case 12:
          System.out.println("コミュニケーション不足で勘違い。");
          System.out.println("自己主張せず控えめな言動を意識。");
          System.out.println("ラッキーポイント：『クソ芋』");
          System.out.println("ただしアドレナリン注射をすると運気アップ！");
      }
      return;
  }
  public void Sagittarius( int num ){
    String seiza = "射手座";
    System.out.println( num + "位：" + seiza);
    switch( num ){
      case 1:
        System.out.println("故意のビッグチャンス到来でモテモテ！");
        System.out.println("気になる人には積極的なアピールを！");
        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
	System.out.println("ただしイケメンに限る");
        System.out.println("");
        break;
      case 2:
        System.out.println("故意のビッグチャンス到来でモテモテ！");
        System.out.println("気になる人には積極的なアピールを！");
        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
System.out.println("ただしイケメンに限る");
        System.out.println("");
        break;
      case 3:
        System.out.println("故意のビッグチャンス到来でモテモテ！");
        System.out.println("気になる人には積極的なアピールを！");
        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
System.out.println("ただしイケメンに限る");
        System.out.println("");
        break;
      case 4:
        System.out.println("故意のビッグチャンス到来でモテモテ！");
        System.out.println("気になる人には積極的なアピールを！");
        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
System.out.println("ただしイケメンに限る");
        System.out.println("");
        break;
      case 5:
        System.out.println("故意のビッグチャンス到来でモテモテ！");
        System.out.println("気になる人には積極的なアピールを！");
        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
System.out.println("ただしイケメンに限る");
        System.out.println("");
        break;
      case 6:
        System.out.println("故意のビッグチャンス到来でモテモテ！");
        System.out.println("気になる人には積極的なアピールを！");
        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
System.out.println("ただしイケメンに限る");
        System.out.println("");
        break;
      case 7:
        System.out.println("故意のビッグチャンス到来でモテモテ！");
        System.out.println("気になる人には積極的なアピールを！");
        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
System.out.println("ただしイケメンに限る");
        System.out.println("");
        break;
      case 8:
        System.out.println("故意のビッグチャンス到来でモテモテ！");
        System.out.println("気になる人には積極的なアピールを！");
        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
System.out.println("ただしイケメンに限る");
        System.out.println("");
        break;
      case 9:
        System.out.println("故意のビッグチャンス到来でモテモテ！");
        System.out.println("気になる人には積極的なアピールを！");
        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
System.out.println("ただしイケメンに限る");
        System.out.println("");
        break;
      case 10:
        System.out.println("故意のビッグチャンス到来でモテモテ！");
        System.out.println("気になる人には積極的なアピールを！");
        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
System.out.println("ただしイケメンに限る");
        System.out.println("");
        break;
      case 11:
        System.out.println("故意のビッグチャンス到来でモテモテ！");
        System.out.println("気になる人には積極的なアピールを！");
        System.out.println("ラッキーポイント：『インテリア雑貨ショップ』");
System.out.println("ただしイケメンに限る");
        System.out.println("");
        break;
      case 12:
        System.out.println("やけどの恐れあり");
        System.out.println("気を付けておきましょう。");
        System.out.println("ラッキーポイント：『手切れ金』");
	System.out.println("ただしイケメンに限る");
        System.out.println("");
        break;
    }
    return;
  }
  public void Capricorn( int num ){
    String seiza = "やぎ座";
    System.out.println( num + "位："+ seiza);
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
  public void Aquarius( int num ){
    String seiza = "水瓶";
    System.out.println( num + "位:" + seiza);
    switch( num ){
      case 1:
        System.out.println("やる気があふれ仕事や勉強が進む日。");
        System.out.println("ラッキーポイント『チラシ』");
        System.out.println("ただし浮かれすぎるのもNG");
        break;
      case 2:
        System.out.println("2位 いて座、眠っていた才能が開花。苦手意識を持たず挑戦。");
        System.out.println("ラッキーポイント『知り合いのブログ』");
        System.out.println("ただし浮かれすぎるのもNG");
        break;
      case 3:
        System.out.println("3位 しし座、努力が実を結び目標達成。こだわりを持った行動を");
        System.out.println("ラッキーポイント『ＶネックＴシャツ』");
        System.out.println("ただし浮かれすぎるのもNG");
        break;
      case 4:
        System.out.println("4位 おとめ座、作業がスムーズに進行♪チームワークを意識して。");
        System.out.println("ラッキーポイント『間違い探しゲーム』");
        System.out.println("ただし浮かれすぎるのもNG");
        break;
      case 5:
        System.out.println("5位 てんびん座、長年の計画がついに実現。最新情報を有効活用して。");
        System.out.println("ラッキーポイント 『甘栗』");
        System.out.println("ただし浮かれすぎるのもNG");
        break;
      case 6:
        System.out.println("6位 おうし座、片思いの恋に嬉しい展開。前向きな姿勢でアタック。");
        System.out.println("ラッキーポイント『クリームチーズ』");
        System.out.println("ただし浮かれすぎるのもNG");
        break;
      case 7:
        System.out.println("7位 さそり座、価値観の違いで問題発生。相手の気持ちも理解して。");
        System.out.println("ラッキーポイント『麻のジャケット』");
        System.out.println("ただし神社にお賽銭、２４時間テレビに募金、被災地に募金すれば運気アップ！！");
        break;
      case 8:
        System.out.println("8位 かに座、口が滑って思わぬ失敗。言葉のチョイスに注意。");
        System.out.println("ラッキーポイント『黒いヘアピン』");
        System.out.println("ただし神社にお賽銭、２４時間テレビに募金、被災地に募金すれば運気アップ！！");
        break;
      case 9:
        System.out.println("9位 おひつじ座、不測の事態が続出しそう。電話の置き忘れに要注意。");
        System.out.println("ラッキーポイント『新刊本』");
        System.out.println("ただし神社にお賽銭、２４時間テレビに募金、被災地に募金すれば運気アップ！！");
        break;
      case 10:
        System.out.println("10位 うお座、他人に振り回され大混乱。怒らずに冷静さを保って。");
        System.out.println("ラッキーポイント『ファッション雑誌』");
        System.out.println("ただし神社にお賽銭、２４時間テレビに募金、被災地に募金すれば運気アップ！！");
        break;
      case 11:
        System.out.println("11位 やぎ座、ウソを見抜けずにトラブル。直感に頼るのはホドホドに。");
        System.out.println("ラッキーポイント『家計簿アプリ』");
        System.out.println("ただし神社にお賽銭、２４時間テレビに募金、被災地に募金すれば運気アップ！！");
        break;
      case 12:
        System.out.println("12位 おとめ座、積極的すぎる行動で周囲から孤立。興味本位で話しかけるのは控えて。");
        System.out.println("ラッキーポイント『大きなペンダント』");
        System.out.println("ただし神社にお賽銭、２４時間テレビに募金、被災地に募金すれば運気アップ！！");
    }
    return;
  }
  public void Pisces( int num ){
    String seiza = "うお座";
    System.out.println( num + "位：" + seiza);
      switch( num ){
        case 1:
          System.out.println("魅力あふれる笑顔で人気急上昇。自信のあるジャンルでアピール。");
          System.out.println("コミュニケーションが弾む");
          System.out.println("ラッキーポイント：『熱帯魚の画像』");
          System.out.println("");
          break;
        case 2:
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
          break;
        case 3:
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
          break;
        case 4:
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
          break;
        case 5:
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
          break;
        case 6:
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
          break;
        case 7:
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
          break;
        case 8:
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
          break;
        case 9:
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
          break;
        case 10:
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
          break;
        case 11:
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
          break;
        case 12:
          System.out.println("ペースを乱されイライラ。あいまいな答えには注意。");
          System.out.println("コミュニケーションを意識して");
          System.out.println("ラッキーポイント：『変顔の写真』");
          System.out.println("");
      }
      if( num < 7){
    	  // 1位～6位の時 ○○に気を付けること
          System.out.println("調子乗るな！乗りすぎると不幸が待っている");
      }
      else{
    	  // 7位～12位 ○○すれば運気UP
          System.out.println("不幸でもあきらめるな");

      }
  }
}
