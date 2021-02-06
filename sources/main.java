package p005io.kodular.themysteryman8308.MagicLiker;

import android.support.p000v4.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.ActivityStarter;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.MakeroidSideMenuLayout;
import com.google.appinventor.components.runtime.MakeroidViewPager;
import com.google.appinventor.components.runtime.Network;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.Sharing;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.WebViewer;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.C1223runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.C1242lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* renamed from: io.kodular.themysteryman8308.MagicLiker.main */
/* compiled from: main.yail */
public class main extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final IntNum Lit10 = IntNum.make(3);
    static final SimpleSymbol Lit100;
    static final SimpleSymbol Lit101;
    static final IntNum Lit102;
    static final SimpleSymbol Lit103;
    static final SimpleSymbol Lit104;
    static final IntNum Lit105 = IntNum.make(17);
    static final IntNum Lit106 = IntNum.make(-1009);
    static final IntNum Lit107 = IntNum.make(-1070);
    static final FString Lit108;
    static final SimpleSymbol Lit109;
    static final PairWithPosition Lit11 = PairWithPosition.make(Lit22, PairWithPosition.make(Lit22, PairWithPosition.make(Lit25, PairWithPosition.make(Lit25, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33206), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33198), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33190), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33185), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33179);
    static final SimpleSymbol Lit110;
    static final SimpleSymbol Lit111;
    static final SimpleSymbol Lit112;
    static final SimpleSymbol Lit113;
    static final SimpleSymbol Lit114;
    static final FString Lit115;
    static final SimpleSymbol Lit116;
    static final FString Lit117;
    static final PairWithPosition Lit118 = PairWithPosition.make(Lit22, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 753745);
    static final SimpleSymbol Lit119;
    static final IntNum Lit12 = IntNum.make(4);
    static final SimpleSymbol Lit120;
    static final FString Lit121;
    static final FString Lit122;
    static final SimpleSymbol Lit123;
    static final PairWithPosition Lit124 = PairWithPosition.make(Lit166, PairWithPosition.make(Lit166, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 782435), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 782430);
    static final SimpleSymbol Lit125;
    static final SimpleSymbol Lit126;
    static final FString Lit127;
    static final SimpleSymbol Lit128;
    static final FString Lit129;
    static final PairWithPosition Lit13 = PairWithPosition.make(Lit22, PairWithPosition.make(Lit22, PairWithPosition.make(Lit25, PairWithPosition.make(Lit25, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33349), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33341), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33333), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33328), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33322);
    static final SimpleSymbol Lit130;
    static final PairWithPosition Lit131 = PairWithPosition.make(Lit166, PairWithPosition.make(Lit166, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 819299), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 819294);
    static final PairWithPosition Lit132 = PairWithPosition.make(Lit166, PairWithPosition.make(Lit166, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 819500), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 819495);
    static final SimpleSymbol Lit133;
    static final SimpleSymbol Lit134;
    static final PairWithPosition Lit135 = PairWithPosition.make(Lit22, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 819725);
    static final PairWithPosition Lit136 = PairWithPosition.make(Lit166, PairWithPosition.make(Lit166, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 819828), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 819823);
    static final SimpleSymbol Lit137;
    static final PairWithPosition Lit138 = PairWithPosition.make(Lit22, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 819930);
    static final PairWithPosition Lit139;
    static final IntNum Lit14 = IntNum.make(5);
    static final PairWithPosition Lit140 = PairWithPosition.make(Lit166, PairWithPosition.make(Lit166, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 820141), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 820136);
    static final PairWithPosition Lit141 = PairWithPosition.make(Lit166, PairWithPosition.make(Lit166, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 820525), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 820520);
    static final SimpleSymbol Lit142;
    static final SimpleSymbol Lit143;
    static final FString Lit144;
    static final SimpleSymbol Lit145;
    static final FString Lit146;
    static final FString Lit147;
    static final FString Lit148;
    static final FString Lit149;
    static final PairWithPosition Lit15 = PairWithPosition.make(Lit22, PairWithPosition.make(Lit22, PairWithPosition.make(Lit25, PairWithPosition.make(Lit25, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33487), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33479), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33471), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33466), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33460);
    static final SimpleSymbol Lit150;
    static final FString Lit151;
    static final SimpleSymbol Lit152;
    static final SimpleSymbol Lit153;
    static final SimpleSymbol Lit154;
    static final SimpleSymbol Lit155;
    static final SimpleSymbol Lit156;
    static final SimpleSymbol Lit157;
    static final SimpleSymbol Lit158;
    static final SimpleSymbol Lit159;
    static final PairWithPosition Lit16 = PairWithPosition.make(Lit22, PairWithPosition.make(Lit22, PairWithPosition.make(Lit25, PairWithPosition.make(Lit25, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 32920), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 32912), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 32904), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 32899), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 32893);
    static final SimpleSymbol Lit160;
    static final SimpleSymbol Lit161;
    static final SimpleSymbol Lit162;
    static final SimpleSymbol Lit163;
    static final SimpleSymbol Lit164;
    static final SimpleSymbol Lit165;
    static final SimpleSymbol Lit166;
    static final SimpleSymbol Lit167;
    static final PairWithPosition Lit17 = PairWithPosition.make(Lit22, PairWithPosition.make(Lit22, PairWithPosition.make(Lit25, PairWithPosition.make(Lit25, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33066), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33058), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33050), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33045), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33039);
    static final PairWithPosition Lit18 = PairWithPosition.make(Lit22, PairWithPosition.make(Lit22, PairWithPosition.make(Lit25, PairWithPosition.make(Lit25, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33206), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33198), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33190), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33185), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33179);
    static final PairWithPosition Lit19 = PairWithPosition.make(Lit22, PairWithPosition.make(Lit22, PairWithPosition.make(Lit25, PairWithPosition.make(Lit25, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33349), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33341), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33333), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33328), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33322);
    static final SimpleSymbol Lit2;
    static final PairWithPosition Lit20 = PairWithPosition.make(Lit22, PairWithPosition.make(Lit22, PairWithPosition.make(Lit25, PairWithPosition.make(Lit25, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33487), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33479), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33471), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33466), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33460);
    static final SimpleSymbol Lit21;
    static final SimpleSymbol Lit22;
    static final SimpleSymbol Lit23;
    static final SimpleSymbol Lit24;
    static final SimpleSymbol Lit25;
    static final SimpleSymbol Lit26;
    static final IntNum Lit27;
    static final SimpleSymbol Lit28;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final IntNum Lit30;
    static final SimpleSymbol Lit31;
    static final IntNum Lit32;
    static final SimpleSymbol Lit33;
    static final SimpleSymbol Lit34;
    static final SimpleSymbol Lit35;
    static final SimpleSymbol Lit36;
    static final SimpleSymbol Lit37;
    static final SimpleSymbol Lit38;
    static final SimpleSymbol Lit39;
    static final SimpleSymbol Lit4;
    static final PairWithPosition Lit40 = PairWithPosition.make(Lit167, PairWithPosition.make(Lit22, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 98470), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 98459);
    static final SimpleSymbol Lit41;
    static final PairWithPosition Lit42 = PairWithPosition.make(Lit167, PairWithPosition.make(Lit22, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 98613), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 98602);
    static final SimpleSymbol Lit43;
    static final PairWithPosition Lit44 = PairWithPosition.make(Lit167, PairWithPosition.make(Lit22, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 98756), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 98745);
    static final SimpleSymbol Lit45;
    static final PairWithPosition Lit46 = PairWithPosition.make(Lit167, PairWithPosition.make(Lit22, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 98899), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 98888);
    static final SimpleSymbol Lit47;
    static final SimpleSymbol Lit48;
    static final SimpleSymbol Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final PairWithPosition Lit51;
    static final SimpleSymbol Lit52;
    static final SimpleSymbol Lit53;
    static final FString Lit54;
    static final FString Lit55;
    static final FString Lit56;
    static final SimpleSymbol Lit57;
    static final SimpleSymbol Lit58;
    static final IntNum Lit59 = IntNum.make(-2);
    static final IntNum Lit6 = IntNum.make(1);
    static final SimpleSymbol Lit60;
    static final SimpleSymbol Lit61;
    static final SimpleSymbol Lit62;
    static final SimpleSymbol Lit63;
    static final FString Lit64;
    static final FString Lit65;
    static final FString Lit66;
    static final FString Lit67;
    static final SimpleSymbol Lit68;
    static final FString Lit69;
    static final PairWithPosition Lit7 = PairWithPosition.make(Lit22, PairWithPosition.make(Lit22, PairWithPosition.make(Lit25, PairWithPosition.make(Lit25, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 32920), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 32912), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 32904), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 32899), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 32893);
    static final FString Lit70;
    static final FString Lit71;
    static final FString Lit72;
    static final SimpleSymbol Lit73;
    static final FString Lit74;
    static final FString Lit75;
    static final FString Lit76;
    static final FString Lit77;
    static final SimpleSymbol Lit78;
    static final FString Lit79;
    static final IntNum Lit8 = IntNum.make(2);
    static final FString Lit80;
    static final FString Lit81;
    static final FString Lit82;
    static final SimpleSymbol Lit83;
    static final SimpleSymbol Lit84;
    static final SimpleSymbol Lit85;
    static final IntNum Lit86 = IntNum.make(35);
    static final FString Lit87;
    static final FString Lit88;
    static final SimpleSymbol Lit89;
    static final PairWithPosition Lit9 = PairWithPosition.make(Lit22, PairWithPosition.make(Lit22, PairWithPosition.make(Lit25, PairWithPosition.make(Lit25, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33066), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33058), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33050), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33045), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 33039);
    static final SimpleSymbol Lit90;
    static final SimpleSymbol Lit91;
    static final SimpleSymbol Lit92;
    static final SimpleSymbol Lit93;
    static final SimpleSymbol Lit94;
    static final FString Lit95;
    static final FString Lit96;
    static final SimpleSymbol Lit97;
    static final FString Lit98;
    static final FString Lit99;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public static main main;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public ActivityStarter Activity_Starter1;
    public ActivityStarter Activity_Starter2;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public Network Network1;
    public final ModuleMethod Network1$OnDisconnect;
    public Notifier Notifier1;
    public final ModuleMethod Notifier1$AfterChoosing;
    public Sharing Sharing1;
    public MakeroidSideMenuLayout Side_Menu_Layout1;
    public final ModuleMethod Side_Menu_Layout1$OnMenuItemClick;
    public TextBox Text_Box1;
    public VerticalArrangement Vertical_Arrangement2;
    public VerticalArrangement Vertical_Arrangement3;
    public VerticalArrangement Vertical_Arrangement4;
    public VerticalArrangement Vertical_Arrangement5;
    public VerticalArrangement Vertical_Arrangement7;
    public VerticalArrangement Vertical_Arrangement8;
    public MakeroidViewPager View_Pager1;
    public WebViewer Web_Viewer2;
    public WebViewer Web_Viewer3;
    public WebViewer Web_Viewer4;
    public WebViewer Web_Viewer5;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod main$BackPressed;
    public final ModuleMethod main$Initialize;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    static {
        SimpleSymbol simpleSymbol;
        SimpleSymbol simpleSymbol2;
        SimpleSymbol simpleSymbol3;
        SimpleSymbol simpleSymbol4;
        SimpleSymbol simpleSymbol5;
        SimpleSymbol simpleSymbol6;
        SimpleSymbol simpleSymbol7;
        SimpleSymbol simpleSymbol8;
        SimpleSymbol simpleSymbol9;
        SimpleSymbol simpleSymbol10;
        SimpleSymbol simpleSymbol11;
        SimpleSymbol simpleSymbol12;
        SimpleSymbol simpleSymbol13;
        SimpleSymbol simpleSymbol14;
        SimpleSymbol simpleSymbol15;
        SimpleSymbol simpleSymbol16;
        FString fString;
        SimpleSymbol simpleSymbol17;
        FString fString2;
        FString fString3;
        FString fString4;
        FString fString5;
        SimpleSymbol simpleSymbol18;
        FString fString6;
        SimpleSymbol simpleSymbol19;
        SimpleSymbol simpleSymbol20;
        SimpleSymbol simpleSymbol21;
        SimpleSymbol simpleSymbol22;
        SimpleSymbol simpleSymbol23;
        SimpleSymbol simpleSymbol24;
        SimpleSymbol simpleSymbol25;
        FString fString7;
        SimpleSymbol simpleSymbol26;
        FString fString8;
        SimpleSymbol simpleSymbol27;
        SimpleSymbol simpleSymbol28;
        SimpleSymbol simpleSymbol29;
        FString fString9;
        FString fString10;
        SimpleSymbol simpleSymbol30;
        SimpleSymbol simpleSymbol31;
        FString fString11;
        SimpleSymbol simpleSymbol32;
        FString fString12;
        SimpleSymbol simpleSymbol33;
        SimpleSymbol simpleSymbol34;
        SimpleSymbol simpleSymbol35;
        SimpleSymbol simpleSymbol36;
        SimpleSymbol simpleSymbol37;
        SimpleSymbol simpleSymbol38;
        FString fString13;
        SimpleSymbol simpleSymbol39;
        SimpleSymbol simpleSymbol40;
        SimpleSymbol simpleSymbol41;
        SimpleSymbol simpleSymbol42;
        FString fString14;
        FString fString15;
        SimpleSymbol simpleSymbol43;
        FString fString16;
        FString fString17;
        SimpleSymbol simpleSymbol44;
        SimpleSymbol simpleSymbol45;
        SimpleSymbol simpleSymbol46;
        SimpleSymbol simpleSymbol47;
        SimpleSymbol simpleSymbol48;
        SimpleSymbol simpleSymbol49;
        FString fString18;
        FString fString19;
        SimpleSymbol simpleSymbol50;
        SimpleSymbol simpleSymbol51;
        SimpleSymbol simpleSymbol52;
        FString fString20;
        FString fString21;
        FString fString22;
        FString fString23;
        SimpleSymbol simpleSymbol53;
        FString fString24;
        FString fString25;
        FString fString26;
        FString fString27;
        SimpleSymbol simpleSymbol54;
        FString fString28;
        FString fString29;
        FString fString30;
        FString fString31;
        SimpleSymbol simpleSymbol55;
        FString fString32;
        FString fString33;
        FString fString34;
        FString fString35;
        SimpleSymbol simpleSymbol56;
        SimpleSymbol simpleSymbol57;
        SimpleSymbol simpleSymbol58;
        SimpleSymbol simpleSymbol59;
        SimpleSymbol simpleSymbol60;
        SimpleSymbol simpleSymbol61;
        FString fString36;
        FString fString37;
        FString fString38;
        SimpleSymbol simpleSymbol62;
        SimpleSymbol simpleSymbol63;
        SimpleSymbol simpleSymbol64;
        SimpleSymbol simpleSymbol65;
        SimpleSymbol simpleSymbol66;
        SimpleSymbol simpleSymbol67;
        SimpleSymbol simpleSymbol68;
        SimpleSymbol simpleSymbol69;
        SimpleSymbol simpleSymbol70;
        SimpleSymbol simpleSymbol71;
        SimpleSymbol simpleSymbol72;
        SimpleSymbol simpleSymbol73;
        SimpleSymbol simpleSymbol74;
        SimpleSymbol simpleSymbol75;
        SimpleSymbol simpleSymbol76;
        SimpleSymbol simpleSymbol77;
        SimpleSymbol simpleSymbol78;
        SimpleSymbol simpleSymbol79;
        SimpleSymbol simpleSymbol80;
        SimpleSymbol simpleSymbol81;
        SimpleSymbol simpleSymbol82;
        SimpleSymbol simpleSymbol83;
        SimpleSymbol simpleSymbol84;
        SimpleSymbol simpleSymbol85;
        SimpleSymbol simpleSymbol86;
        SimpleSymbol simpleSymbol87;
        SimpleSymbol simpleSymbol88;
        SimpleSymbol simpleSymbol89;
        SimpleSymbol simpleSymbol90;
        SimpleSymbol simpleSymbol91;
        new SimpleSymbol("component");
        Lit167 = (SimpleSymbol) simpleSymbol.readResolve();
        new SimpleSymbol("any");
        Lit166 = (SimpleSymbol) simpleSymbol2.readResolve();
        new SimpleSymbol("lookup-handler");
        Lit165 = (SimpleSymbol) simpleSymbol3.readResolve();
        new SimpleSymbol("dispatchGenericEvent");
        Lit164 = (SimpleSymbol) simpleSymbol4.readResolve();
        new SimpleSymbol("dispatchEvent");
        Lit163 = (SimpleSymbol) simpleSymbol5.readResolve();
        new SimpleSymbol("send-error");
        Lit162 = (SimpleSymbol) simpleSymbol6.readResolve();
        new SimpleSymbol("add-to-form-do-after-creation");
        Lit161 = (SimpleSymbol) simpleSymbol7.readResolve();
        new SimpleSymbol("add-to-global-vars");
        Lit160 = (SimpleSymbol) simpleSymbol8.readResolve();
        new SimpleSymbol("add-to-components");
        Lit159 = (SimpleSymbol) simpleSymbol9.readResolve();
        new SimpleSymbol("add-to-events");
        Lit158 = (SimpleSymbol) simpleSymbol10.readResolve();
        new SimpleSymbol("add-to-global-var-environment");
        Lit157 = (SimpleSymbol) simpleSymbol11.readResolve();
        new SimpleSymbol("is-bound-in-form-environment");
        Lit156 = (SimpleSymbol) simpleSymbol12.readResolve();
        new SimpleSymbol("lookup-in-form-environment");
        Lit155 = (SimpleSymbol) simpleSymbol13.readResolve();
        new SimpleSymbol("add-to-form-environment");
        Lit154 = (SimpleSymbol) simpleSymbol14.readResolve();
        new SimpleSymbol("android-log-form");
        Lit153 = (SimpleSymbol) simpleSymbol15.readResolve();
        new SimpleSymbol("get-simple-name");
        Lit152 = (SimpleSymbol) simpleSymbol16.readResolve();
        new FString("com.google.appinventor.components.runtime.ActivityStarter");
        Lit151 = fString;
        new SimpleSymbol("Activity_Starter2");
        Lit150 = (SimpleSymbol) simpleSymbol17.readResolve();
        new FString("com.google.appinventor.components.runtime.ActivityStarter");
        Lit149 = fString2;
        new FString("com.google.appinventor.components.runtime.ActivityStarter");
        Lit148 = fString3;
        new FString("com.google.appinventor.components.runtime.ActivityStarter");
        Lit147 = fString4;
        new FString("com.google.appinventor.components.runtime.Sharing");
        Lit146 = fString5;
        new SimpleSymbol("ShareDialogMessage");
        Lit145 = (SimpleSymbol) simpleSymbol18.readResolve();
        new FString("com.google.appinventor.components.runtime.Sharing");
        Lit144 = fString6;
        new SimpleSymbol("OnMenuItemClick");
        Lit143 = (SimpleSymbol) simpleSymbol19.readResolve();
        new SimpleSymbol("Side_Menu_Layout1$OnMenuItemClick");
        Lit142 = (SimpleSymbol) simpleSymbol20.readResolve();
        new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT);
        SimpleSymbol simpleSymbol92 = (SimpleSymbol) simpleSymbol21.readResolve();
        Lit22 = simpleSymbol92;
        Lit139 = PairWithPosition.make(simpleSymbol92, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 820007);
        new SimpleSymbol("ShowAlert");
        Lit137 = (SimpleSymbol) simpleSymbol22.readResolve();
        new SimpleSymbol("ShareMessage");
        Lit134 = (SimpleSymbol) simpleSymbol23.readResolve();
        new SimpleSymbol("Sharing1");
        Lit133 = (SimpleSymbol) simpleSymbol24.readResolve();
        new SimpleSymbol("$title");
        Lit130 = (SimpleSymbol) simpleSymbol25.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidSideMenuLayout");
        Lit129 = fString7;
        new SimpleSymbol("HeaderBackgroundImage");
        Lit128 = (SimpleSymbol) simpleSymbol26.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidSideMenuLayout");
        Lit127 = fString8;
        new SimpleSymbol("AfterChoosing");
        Lit126 = (SimpleSymbol) simpleSymbol27.readResolve();
        new SimpleSymbol("Notifier1$AfterChoosing");
        Lit125 = (SimpleSymbol) simpleSymbol28.readResolve();
        new SimpleSymbol("$choice");
        Lit123 = (SimpleSymbol) simpleSymbol29.readResolve();
        new FString("com.google.appinventor.components.runtime.Notifier");
        Lit122 = fString9;
        new FString("com.google.appinventor.components.runtime.Notifier");
        Lit121 = fString10;
        new SimpleSymbol("OnDisconnect");
        Lit120 = (SimpleSymbol) simpleSymbol30.readResolve();
        new SimpleSymbol("Network1$OnDisconnect");
        Lit119 = (SimpleSymbol) simpleSymbol31.readResolve();
        new FString("com.google.appinventor.components.runtime.Network");
        Lit117 = fString11;
        new SimpleSymbol("Network1");
        Lit116 = (SimpleSymbol) simpleSymbol32.readResolve();
        new FString("com.google.appinventor.components.runtime.Network");
        Lit115 = fString12;
        new SimpleSymbol("Click");
        Lit114 = (SimpleSymbol) simpleSymbol33.readResolve();
        new SimpleSymbol("Button1$Click");
        Lit113 = (SimpleSymbol) simpleSymbol34.readResolve();
        new SimpleSymbol("StartActivity");
        Lit112 = (SimpleSymbol) simpleSymbol35.readResolve();
        new SimpleSymbol("DataUri");
        Lit111 = (SimpleSymbol) simpleSymbol36.readResolve();
        new SimpleSymbol("Action");
        Lit110 = (SimpleSymbol) simpleSymbol37.readResolve();
        new SimpleSymbol("Activity_Starter1");
        Lit109 = (SimpleSymbol) simpleSymbol38.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit108 = fString13;
        new SimpleSymbol("FontSize");
        Lit104 = (SimpleSymbol) simpleSymbol39.readResolve();
        new SimpleSymbol("FontItalic");
        Lit103 = (SimpleSymbol) simpleSymbol40.readResolve();
        int[] iArr = new int[2];
        iArr[0] = -10060054;
        Lit102 = IntNum.make(iArr);
        new SimpleSymbol("BackgroundColor");
        Lit101 = (SimpleSymbol) simpleSymbol41.readResolve();
        new SimpleSymbol("Button1");
        Lit100 = (SimpleSymbol) simpleSymbol42.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit99 = fString14;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit98 = fString15;
        new SimpleSymbol("Vertical_Arrangement8");
        Lit97 = (SimpleSymbol) simpleSymbol43.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit96 = fString16;
        new FString("com.google.appinventor.components.runtime.TextBox");
        Lit95 = fString17;
        new SimpleSymbol("TextAlignment");
        Lit94 = (SimpleSymbol) simpleSymbol44.readResolve();
        new SimpleSymbol("Text");
        Lit93 = (SimpleSymbol) simpleSymbol45.readResolve();
        new SimpleSymbol("ReadOnly");
        Lit92 = (SimpleSymbol) simpleSymbol46.readResolve();
        new SimpleSymbol("Hint");
        Lit91 = (SimpleSymbol) simpleSymbol47.readResolve();
        new SimpleSymbol("ErrorText");
        Lit90 = (SimpleSymbol) simpleSymbol48.readResolve();
        new SimpleSymbol("Text_Box1");
        Lit89 = (SimpleSymbol) simpleSymbol49.readResolve();
        new FString("com.google.appinventor.components.runtime.TextBox");
        Lit88 = fString18;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit87 = fString19;
        new SimpleSymbol("AlignVertical");
        Lit85 = (SimpleSymbol) simpleSymbol50.readResolve();
        new SimpleSymbol("AlignHorizontal");
        Lit84 = (SimpleSymbol) simpleSymbol51.readResolve();
        new SimpleSymbol("Vertical_Arrangement7");
        Lit83 = (SimpleSymbol) simpleSymbol52.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit82 = fString20;
        new FString("com.google.appinventor.components.runtime.MakeroidViewPager");
        Lit81 = fString21;
        new FString("com.google.appinventor.components.runtime.MakeroidViewPager");
        Lit80 = fString22;
        new FString("com.google.appinventor.components.runtime.WebViewer");
        Lit79 = fString23;
        new SimpleSymbol("Web_Viewer5");
        Lit78 = (SimpleSymbol) simpleSymbol53.readResolve();
        new FString("com.google.appinventor.components.runtime.WebViewer");
        Lit77 = fString24;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit76 = fString25;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit75 = fString26;
        new FString("com.google.appinventor.components.runtime.WebViewer");
        Lit74 = fString27;
        new SimpleSymbol("Web_Viewer4");
        Lit73 = (SimpleSymbol) simpleSymbol54.readResolve();
        new FString("com.google.appinventor.components.runtime.WebViewer");
        Lit72 = fString28;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit71 = fString29;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit70 = fString30;
        new FString("com.google.appinventor.components.runtime.WebViewer");
        Lit69 = fString31;
        new SimpleSymbol("Web_Viewer2");
        Lit68 = (SimpleSymbol) simpleSymbol55.readResolve();
        new FString("com.google.appinventor.components.runtime.WebViewer");
        Lit67 = fString32;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit66 = fString33;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit65 = fString34;
        new FString("com.google.appinventor.components.runtime.WebViewer");
        Lit64 = fString35;
        new SimpleSymbol("ZoomEnabled");
        Lit63 = (SimpleSymbol) simpleSymbol56.readResolve();
        new SimpleSymbol("ZoomDisplay");
        Lit62 = (SimpleSymbol) simpleSymbol57.readResolve();
        new SimpleSymbol("HomeUrl");
        Lit61 = (SimpleSymbol) simpleSymbol58.readResolve();
        new SimpleSymbol("Width");
        Lit60 = (SimpleSymbol) simpleSymbol59.readResolve();
        new SimpleSymbol("Height");
        Lit58 = (SimpleSymbol) simpleSymbol60.readResolve();
        new SimpleSymbol("Web_Viewer3");
        Lit57 = (SimpleSymbol) simpleSymbol61.readResolve();
        new FString("com.google.appinventor.components.runtime.WebViewer");
        Lit56 = fString36;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit55 = fString37;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit54 = fString38;
        new SimpleSymbol("BackPressed");
        Lit53 = (SimpleSymbol) simpleSymbol62.readResolve();
        new SimpleSymbol("main$BackPressed");
        Lit52 = (SimpleSymbol) simpleSymbol63.readResolve();
        SimpleSymbol simpleSymbol93 = Lit22;
        SimpleSymbol simpleSymbol94 = Lit22;
        SimpleSymbol simpleSymbol95 = Lit22;
        SimpleSymbol simpleSymbol96 = Lit22;
        new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN);
        SimpleSymbol simpleSymbol97 = (SimpleSymbol) simpleSymbol64.readResolve();
        Lit25 = simpleSymbol97;
        Lit51 = PairWithPosition.make(simpleSymbol93, PairWithPosition.make(simpleSymbol94, PairWithPosition.make(simpleSymbol95, PairWithPosition.make(simpleSymbol96, PairWithPosition.make(simpleSymbol97, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 106642), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 106637), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 106632), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 106627), "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/main.yail", 106621);
        new SimpleSymbol("ShowChooseDialog");
        Lit50 = (SimpleSymbol) simpleSymbol65.readResolve();
        new SimpleSymbol("Notifier1");
        Lit49 = (SimpleSymbol) simpleSymbol66.readResolve();
        new SimpleSymbol("Initialize");
        Lit48 = (SimpleSymbol) simpleSymbol67.readResolve();
        new SimpleSymbol("main$Initialize");
        Lit47 = (SimpleSymbol) simpleSymbol68.readResolve();
        new SimpleSymbol("Vertical_Arrangement5");
        Lit45 = (SimpleSymbol) simpleSymbol69.readResolve();
        new SimpleSymbol("Vertical_Arrangement4");
        Lit43 = (SimpleSymbol) simpleSymbol70.readResolve();
        new SimpleSymbol("Vertical_Arrangement2");
        Lit41 = (SimpleSymbol) simpleSymbol71.readResolve();
        new SimpleSymbol("Vertical_Arrangement3");
        Lit39 = (SimpleSymbol) simpleSymbol72.readResolve();
        new SimpleSymbol("AddComponentToView");
        Lit38 = (SimpleSymbol) simpleSymbol73.readResolve();
        new SimpleSymbol("View_Pager1");
        Lit37 = (SimpleSymbol) simpleSymbol74.readResolve();
        new SimpleSymbol("Title");
        Lit36 = (SimpleSymbol) simpleSymbol75.readResolve();
        new SimpleSymbol("ShowOptionsMenu");
        Lit35 = (SimpleSymbol) simpleSymbol76.readResolve();
        new SimpleSymbol("ReceiveSharedText");
        Lit34 = (SimpleSymbol) simpleSymbol77.readResolve();
        new SimpleSymbol("RTLSupport");
        Lit33 = (SimpleSymbol) simpleSymbol78.readResolve();
        int[] iArr2 = new int[2];
        iArr2[0] = -10060054;
        Lit32 = IntNum.make(iArr2);
        new SimpleSymbol("PrimaryColorDark");
        Lit31 = (SimpleSymbol) simpleSymbol79.readResolve();
        int[] iArr3 = new int[2];
        iArr3[0] = -10060054;
        Lit30 = IntNum.make(iArr3);
        new SimpleSymbol("PrimaryColor");
        Lit29 = (SimpleSymbol) simpleSymbol80.readResolve();
        new SimpleSymbol("number");
        Lit28 = (SimpleSymbol) simpleSymbol81.readResolve();
        int[] iArr4 = new int[2];
        iArr4[0] = -10060054;
        Lit27 = IntNum.make(iArr4);
        new SimpleSymbol("NavigationBarColor");
        Lit26 = (SimpleSymbol) simpleSymbol82.readResolve();
        new SimpleSymbol("HighQuality");
        Lit24 = (SimpleSymbol) simpleSymbol83.readResolve();
        new SimpleSymbol("AppName");
        Lit23 = (SimpleSymbol) simpleSymbol84.readResolve();
        new SimpleSymbol("AppId");
        Lit21 = (SimpleSymbol) simpleSymbol85.readResolve();
        new SimpleSymbol("AddItem");
        Lit5 = (SimpleSymbol) simpleSymbol86.readResolve();
        new SimpleSymbol("Side_Menu_Layout1");
        Lit4 = (SimpleSymbol) simpleSymbol87.readResolve();
        new SimpleSymbol("p$procedure");
        Lit3 = (SimpleSymbol) simpleSymbol88.readResolve();
        new SimpleSymbol("*the-null-value*");
        Lit2 = (SimpleSymbol) simpleSymbol89.readResolve();
        new SimpleSymbol("getMessage");
        Lit1 = (SimpleSymbol) simpleSymbol90.readResolve();
        new SimpleSymbol("main");
        Lit0 = (SimpleSymbol) simpleSymbol91.readResolve();
    }

    public main() {
        ModuleMethod moduleMethod;
        frame frame2;
        ModuleMethod moduleMethod2;
        ModuleMethod moduleMethod3;
        ModuleMethod moduleMethod4;
        ModuleMethod moduleMethod5;
        ModuleMethod moduleMethod6;
        ModuleMethod moduleMethod7;
        ModuleMethod moduleMethod8;
        ModuleMethod moduleMethod9;
        ModuleMethod moduleMethod10;
        ModuleMethod moduleMethod11;
        ModuleMethod moduleMethod12;
        ModuleMethod moduleMethod13;
        ModuleMethod moduleMethod14;
        ModuleMethod moduleMethod15;
        ModuleMethod moduleMethod16;
        ModuleMethod moduleMethod17;
        ModuleMethod moduleMethod18;
        ModuleMethod moduleMethod19;
        ModuleMethod moduleMethod20;
        ModuleMethod moduleMethod21;
        ModuleMethod moduleMethod22;
        ModuleMethod moduleMethod23;
        ModuleMethod moduleMethod24;
        ModuleMethod moduleMethod25;
        ModuleMethod moduleMethod26;
        ModuleMethod moduleMethod27;
        ModuleMethod moduleMethod28;
        ModuleMethod moduleMethod29;
        ModuleMethod moduleMethod30;
        ModuleMethod moduleMethod31;
        ModuleMethod moduleMethod32;
        ModuleMethod moduleMethod33;
        ModuleMethod moduleMethod34;
        ModuleMethod moduleMethod35;
        ModuleMethod moduleMethod36;
        ModuleMethod moduleMethod37;
        ModuleMethod moduleMethod38;
        ModuleMethod moduleMethod39;
        ModuleMethod moduleMethod40;
        ModuleMethod moduleMethod41;
        ModuleMethod moduleMethod42;
        ModuleMethod moduleMethod43;
        ModuleMethod moduleMethod44;
        ModuleMethod moduleMethod45;
        ModuleMethod moduleMethod46;
        ModuleMethod moduleMethod47;
        ModuleMethod moduleMethod48;
        ModuleMethod moduleMethod49;
        ModuleInfo.register(this);
        ModuleMethod moduleMethod50 = moduleMethod;
        new frame();
        frame frame3 = frame2;
        frame3.$main = this;
        frame frame4 = frame3;
        new ModuleMethod(frame4, 1, Lit152, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.get$Mnsimple$Mnname = moduleMethod50;
        new ModuleMethod(frame4, 2, Lit153, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = moduleMethod2;
        new ModuleMethod(frame4, 3, Lit154, 8194);
        this.add$Mnto$Mnform$Mnenvironment = moduleMethod3;
        new ModuleMethod(frame4, 4, Lit155, 8193);
        this.lookup$Mnin$Mnform$Mnenvironment = moduleMethod4;
        new ModuleMethod(frame4, 6, Lit156, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = moduleMethod5;
        new ModuleMethod(frame4, 7, Lit157, 8194);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = moduleMethod6;
        new ModuleMethod(frame4, 8, Lit158, 8194);
        this.add$Mnto$Mnevents = moduleMethod7;
        new ModuleMethod(frame4, 9, Lit159, 16388);
        this.add$Mnto$Mncomponents = moduleMethod8;
        new ModuleMethod(frame4, 10, Lit160, 8194);
        this.add$Mnto$Mnglobal$Mnvars = moduleMethod9;
        new ModuleMethod(frame4, 11, Lit161, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = moduleMethod10;
        new ModuleMethod(frame4, 12, Lit162, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = moduleMethod11;
        new ModuleMethod(frame4, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = moduleMethod12;
        new ModuleMethod(frame4, 14, Lit163, 16388);
        this.dispatchEvent = moduleMethod13;
        new ModuleMethod(frame4, 15, Lit164, 16388);
        this.dispatchGenericEvent = moduleMethod14;
        new ModuleMethod(frame4, 16, Lit165, 8194);
        this.lookup$Mnhandler = moduleMethod15;
        new ModuleMethod(frame4, 17, (Object) null, 0);
        ModuleMethod moduleMethod51 = moduleMethod16;
        moduleMethod51.setProperty("source-location", "/tmp/runtime947713386790088419.scm:615");
        lambda$Fn1 = moduleMethod51;
        new ModuleMethod(frame4, 18, "$define", 0);
        this.$define = moduleMethod17;
        new ModuleMethod(frame4, 19, (Object) null, 0);
        lambda$Fn2 = moduleMethod18;
        new ModuleMethod(frame4, 20, (Object) null, 0);
        lambda$Fn4 = moduleMethod19;
        new ModuleMethod(frame4, 21, (Object) null, 0);
        lambda$Fn3 = moduleMethod20;
        new ModuleMethod(frame4, 22, (Object) null, 0);
        lambda$Fn5 = moduleMethod21;
        new ModuleMethod(frame4, 23, Lit47, 0);
        this.main$Initialize = moduleMethod22;
        new ModuleMethod(frame4, 24, Lit52, 0);
        this.main$BackPressed = moduleMethod23;
        new ModuleMethod(frame4, 25, (Object) null, 0);
        lambda$Fn6 = moduleMethod24;
        new ModuleMethod(frame4, 26, (Object) null, 0);
        lambda$Fn7 = moduleMethod25;
        new ModuleMethod(frame4, 27, (Object) null, 0);
        lambda$Fn8 = moduleMethod26;
        new ModuleMethod(frame4, 28, (Object) null, 0);
        lambda$Fn9 = moduleMethod27;
        new ModuleMethod(frame4, 29, (Object) null, 0);
        lambda$Fn10 = moduleMethod28;
        new ModuleMethod(frame4, 30, (Object) null, 0);
        lambda$Fn11 = moduleMethod29;
        new ModuleMethod(frame4, 31, (Object) null, 0);
        lambda$Fn12 = moduleMethod30;
        new ModuleMethod(frame4, 32, (Object) null, 0);
        lambda$Fn13 = moduleMethod31;
        new ModuleMethod(frame4, 33, (Object) null, 0);
        lambda$Fn14 = moduleMethod32;
        new ModuleMethod(frame4, 34, (Object) null, 0);
        lambda$Fn15 = moduleMethod33;
        new ModuleMethod(frame4, 35, (Object) null, 0);
        lambda$Fn16 = moduleMethod34;
        new ModuleMethod(frame4, 36, (Object) null, 0);
        lambda$Fn17 = moduleMethod35;
        new ModuleMethod(frame4, 37, (Object) null, 0);
        lambda$Fn18 = moduleMethod36;
        new ModuleMethod(frame4, 38, (Object) null, 0);
        lambda$Fn19 = moduleMethod37;
        new ModuleMethod(frame4, 39, (Object) null, 0);
        lambda$Fn20 = moduleMethod38;
        new ModuleMethod(frame4, 40, (Object) null, 0);
        lambda$Fn21 = moduleMethod39;
        new ModuleMethod(frame4, 41, (Object) null, 0);
        lambda$Fn22 = moduleMethod40;
        new ModuleMethod(frame4, 42, (Object) null, 0);
        lambda$Fn23 = moduleMethod41;
        new ModuleMethod(frame4, 43, Lit113, 0);
        this.Button1$Click = moduleMethod42;
        new ModuleMethod(frame4, 44, Lit119, 0);
        this.Network1$OnDisconnect = moduleMethod43;
        new ModuleMethod(frame4, 45, Lit125, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.Notifier1$AfterChoosing = moduleMethod44;
        new ModuleMethod(frame4, 46, (Object) null, 0);
        lambda$Fn24 = moduleMethod45;
        new ModuleMethod(frame4, 47, (Object) null, 0);
        lambda$Fn25 = moduleMethod46;
        new ModuleMethod(frame4, 48, Lit142, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.Side_Menu_Layout1$OnMenuItemClick = moduleMethod47;
        new ModuleMethod(frame4, 49, (Object) null, 0);
        lambda$Fn26 = moduleMethod48;
        new ModuleMethod(frame4, 50, (Object) null, 0);
        lambda$Fn27 = moduleMethod49;
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        Throwable th;
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        Throwable th;
        String obj;
        Throwable th2;
        Object obj2;
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        Object obj3 = find;
        try {
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            Object[] objArr = new Object[2];
            objArr[0] = misc.symbol$To$String(Lit0);
            Object[] objArr2 = objArr;
            objArr2[1] = "-global-vars";
            FString stringAppend = strings.stringAppend(objArr2);
            FString fString = stringAppend;
            if (stringAppend == null) {
                obj = null;
            } else {
                obj = fString.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(obj);
            main = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            Object find2 = require.find("com.google.youngandroid.runtime");
            Object obj4 = find2;
            try {
                ((Runnable) find2).run();
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addGlobalVarToCurrentFormEnvironment(Lit3, lambda$Fn2), $result);
                } else {
                    addToGlobalVars(Lit3, lambda$Fn3);
                }
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "6182857846292480", Lit22);
                    Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "IndianSmartSMMPanel", Lit22);
                    Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Boolean.TRUE, Lit25);
                    Object andCoerceProperty$Ex4 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit26, Lit27, Lit28);
                    Object andCoerceProperty$Ex5 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit29, Lit30, Lit28);
                    Object andCoerceProperty$Ex6 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit31, Lit32, Lit28);
                    Object andCoerceProperty$Ex7 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit33, Boolean.TRUE, Lit25);
                    Object andCoerceProperty$Ex8 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit34, "none", Lit22);
                    Object andCoerceProperty$Ex9 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit35, Boolean.FALSE, Lit25);
                    Values.writeValues(C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit36, "Grow Follow", Lit22), $result);
                } else {
                    new Promise(lambda$Fn5);
                    addToFormDoAfterCreation(obj2);
                }
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment = C1223runtime.addToCurrentFormEnvironment(Lit47, this.main$Initialize);
                } else {
                    addToFormEnvironment(Lit47, this.main$Initialize);
                }
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1223runtime.$Stthis$Mnform$St, "main", "Initialize");
                } else {
                    addToEvents(Lit0, Lit48);
                }
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment2 = C1223runtime.addToCurrentFormEnvironment(Lit52, this.main$BackPressed);
                } else {
                    addToFormEnvironment(Lit52, this.main$BackPressed);
                }
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1223runtime.$Stthis$Mnform$St, "main", "BackPressed");
                } else {
                    addToEvents(Lit0, Lit53);
                }
                this.Vertical_Arrangement3 = null;
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit54, Lit39, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit55, Lit39, Boolean.FALSE);
                }
                this.Web_Viewer3 = null;
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addComponentWithinRepl(Lit39, Lit56, Lit57, lambda$Fn6), $result);
                } else {
                    addToComponents(Lit39, Lit64, Lit57, lambda$Fn7);
                }
                this.Vertical_Arrangement2 = null;
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit65, Lit41, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit66, Lit41, Boolean.FALSE);
                }
                this.Web_Viewer2 = null;
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addComponentWithinRepl(Lit41, Lit67, Lit68, lambda$Fn8), $result);
                } else {
                    addToComponents(Lit41, Lit69, Lit68, lambda$Fn9);
                }
                this.Vertical_Arrangement4 = null;
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit70, Lit43, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit71, Lit43, Boolean.FALSE);
                }
                this.Web_Viewer4 = null;
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addComponentWithinRepl(Lit43, Lit72, Lit73, lambda$Fn10), $result);
                } else {
                    addToComponents(Lit43, Lit74, Lit73, lambda$Fn11);
                }
                this.Vertical_Arrangement5 = null;
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit75, Lit45, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit76, Lit45, Boolean.FALSE);
                }
                this.Web_Viewer5 = null;
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addComponentWithinRepl(Lit45, Lit77, Lit78, lambda$Fn12), $result);
                } else {
                    addToComponents(Lit45, Lit79, Lit78, lambda$Fn13);
                }
                this.View_Pager1 = null;
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit80, Lit37, lambda$Fn14), $result);
                } else {
                    addToComponents(Lit0, Lit81, Lit37, lambda$Fn15);
                }
                this.Vertical_Arrangement7 = null;
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit82, Lit83, lambda$Fn16), $result);
                } else {
                    addToComponents(Lit0, Lit87, Lit83, lambda$Fn17);
                }
                this.Text_Box1 = null;
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addComponentWithinRepl(Lit83, Lit88, Lit89, lambda$Fn18), $result);
                } else {
                    addToComponents(Lit83, Lit95, Lit89, lambda$Fn19);
                }
                this.Vertical_Arrangement8 = null;
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit96, Lit97, lambda$Fn20), $result);
                } else {
                    addToComponents(Lit0, Lit98, Lit97, lambda$Fn21);
                }
                this.Button1 = null;
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addComponentWithinRepl(Lit97, Lit99, Lit100, lambda$Fn22), $result);
                } else {
                    addToComponents(Lit97, Lit108, Lit100, lambda$Fn23);
                }
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment3 = C1223runtime.addToCurrentFormEnvironment(Lit113, this.Button1$Click);
                } else {
                    addToFormEnvironment(Lit113, this.Button1$Click);
                }
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1223runtime.$Stthis$Mnform$St, "Button1", "Click");
                } else {
                    addToEvents(Lit100, Lit114);
                }
                this.Network1 = null;
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit115, Lit116, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit117, Lit116, Boolean.FALSE);
                }
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment4 = C1223runtime.addToCurrentFormEnvironment(Lit119, this.Network1$OnDisconnect);
                } else {
                    addToFormEnvironment(Lit119, this.Network1$OnDisconnect);
                }
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1223runtime.$Stthis$Mnform$St, "Network1", "OnDisconnect");
                } else {
                    addToEvents(Lit116, Lit120);
                }
                this.Notifier1 = null;
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit121, Lit49, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit122, Lit49, Boolean.FALSE);
                }
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment5 = C1223runtime.addToCurrentFormEnvironment(Lit125, this.Notifier1$AfterChoosing);
                } else {
                    addToFormEnvironment(Lit125, this.Notifier1$AfterChoosing);
                }
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1223runtime.$Stthis$Mnform$St, "Notifier1", "AfterChoosing");
                } else {
                    addToEvents(Lit49, Lit126);
                }
                this.Side_Menu_Layout1 = null;
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit127, Lit4, lambda$Fn24), $result);
                } else {
                    addToComponents(Lit0, Lit129, Lit4, lambda$Fn25);
                }
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment6 = C1223runtime.addToCurrentFormEnvironment(Lit142, this.Side_Menu_Layout1$OnMenuItemClick);
                } else {
                    addToFormEnvironment(Lit142, this.Side_Menu_Layout1$OnMenuItemClick);
                }
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1223runtime.$Stthis$Mnform$St, "Side_Menu_Layout1", "OnMenuItemClick");
                } else {
                    addToEvents(Lit4, Lit143);
                }
                this.Sharing1 = null;
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit144, Lit133, lambda$Fn26), $result);
                } else {
                    addToComponents(Lit0, Lit146, Lit133, lambda$Fn27);
                }
                this.Activity_Starter1 = null;
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit147, Lit109, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit148, Lit109, Boolean.FALSE);
                }
                this.Activity_Starter2 = null;
                if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit149, Lit150, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit151, Lit150, Boolean.FALSE);
                }
                C1223runtime.initRuntime();
            } catch (ClassCastException e) {
                ClassCastException classCastException = e;
                Throwable th3 = th2;
                new WrongType(classCastException, "java.lang.Runnable.run()", 1, obj4);
                throw th3;
            }
        } catch (ClassCastException e2) {
            ClassCastException classCastException2 = e2;
            Throwable th4 = th;
            new WrongType(classCastException2, "java.lang.Runnable.run()", 1, obj3);
            throw th4;
        }
    }

    /* renamed from: io.kodular.themysteryman8308.MagicLiker.main$frame */
    /* compiled from: main.yail */
    public class frame extends ModuleBody {
        main $main;

        public frame() {
        }

        public Object apply0(ModuleMethod moduleMethod) {
            ModuleMethod moduleMethod2 = moduleMethod;
            switch (moduleMethod2.selector) {
                case 17:
                    return main.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return main.lambda3();
                case 20:
                    return main.lambda5();
                case 21:
                    return main.lambda4();
                case 22:
                    return main.lambda6();
                case 23:
                    return this.$main.main$Initialize();
                case 24:
                    return this.$main.main$BackPressed();
                case 25:
                    return main.lambda7();
                case 26:
                    return main.lambda8();
                case 27:
                    return main.lambda9();
                case 28:
                    return main.lambda10();
                case 29:
                    return main.lambda11();
                case 30:
                    return main.lambda12();
                case 31:
                    return main.lambda13();
                case 32:
                    return main.lambda14();
                case 33:
                    return main.lambda15();
                case 34:
                    return main.lambda16();
                case 35:
                    return main.lambda17();
                case 36:
                    return main.lambda18();
                case 37:
                    return main.lambda19();
                case 38:
                    return main.lambda20();
                case 39:
                    return main.lambda21();
                case 40:
                    return main.lambda22();
                case 41:
                    return main.lambda23();
                case 42:
                    return main.lambda24();
                case 43:
                    return this.$main.Button1$Click();
                case 44:
                    return this.$main.Network1$OnDisconnect();
                case 46:
                    return main.lambda25();
                case 47:
                    return main.lambda26();
                case 49:
                    return main.lambda27();
                case 50:
                    return main.lambda28();
                default:
                    return super.apply0(moduleMethod2);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 17:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 18:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 19:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 20:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 21:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 22:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 23:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 24:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 25:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 26:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 27:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 28:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 29:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 30:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 31:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 32:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 33:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 34:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 35:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 36:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 37:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 38:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 39:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 40:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 41:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 42:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 43:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 44:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 46:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 47:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 49:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 50:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod2, callContext2);
            }
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj2 = obj;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 1:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 2:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 4:
                    CallContext callContext3 = callContext2;
                    Object obj3 = obj2;
                    Object obj4 = obj3;
                    if (!(obj3 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext3.value1 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 6:
                    CallContext callContext4 = callContext2;
                    Object obj5 = obj2;
                    Object obj6 = obj5;
                    if (!(obj5 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext4.value1 = obj6;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 11:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 12:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 13:
                    CallContext callContext5 = callContext2;
                    Object obj7 = obj2;
                    Object obj8 = obj7;
                    if (!(obj7 instanceof main)) {
                        return -786431;
                    }
                    callContext5.value1 = obj8;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 45:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 48:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod2, obj2, callContext2);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj3 = obj;
            Object obj4 = obj2;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 3:
                    CallContext callContext3 = callContext2;
                    Object obj5 = obj3;
                    Object obj6 = obj5;
                    if (!(obj5 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext3.value1 = obj6;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 2;
                    return 0;
                case 4:
                    CallContext callContext4 = callContext2;
                    Object obj7 = obj3;
                    Object obj8 = obj7;
                    if (!(obj7 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext4.value1 = obj8;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 2;
                    return 0;
                case 7:
                    CallContext callContext5 = callContext2;
                    Object obj9 = obj3;
                    Object obj10 = obj9;
                    if (!(obj9 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext5.value1 = obj10;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 2;
                    return 0;
                case 8:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 2;
                    return 0;
                case 10:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 2;
                    return 0;
                case 16:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod2, obj3, obj4, callContext2);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj5 = obj;
            Object obj6 = obj2;
            Object obj7 = obj3;
            Object obj8 = obj4;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 9:
                    callContext2.value1 = obj5;
                    callContext2.value2 = obj6;
                    callContext2.value3 = obj7;
                    callContext2.value4 = obj8;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 4;
                    return 0;
                case 14:
                    CallContext callContext3 = callContext2;
                    Object obj9 = obj5;
                    Object obj10 = obj9;
                    if (!(obj9 instanceof main)) {
                        return -786431;
                    }
                    callContext3.value1 = obj10;
                    CallContext callContext4 = callContext2;
                    Object obj11 = obj6;
                    Object obj12 = obj11;
                    if (!(obj11 instanceof Component)) {
                        return -786430;
                    }
                    callContext4.value2 = obj12;
                    CallContext callContext5 = callContext2;
                    Object obj13 = obj7;
                    Object obj14 = obj13;
                    if (!(obj13 instanceof String)) {
                        return -786429;
                    }
                    callContext5.value3 = obj14;
                    CallContext callContext6 = callContext2;
                    Object obj15 = obj8;
                    Object obj16 = obj15;
                    if (!(obj15 instanceof String)) {
                        return -786428;
                    }
                    callContext6.value4 = obj16;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 4;
                    return 0;
                case 15:
                    CallContext callContext7 = callContext2;
                    Object obj17 = obj5;
                    Object obj18 = obj17;
                    if (!(obj17 instanceof main)) {
                        return -786431;
                    }
                    callContext7.value1 = obj18;
                    CallContext callContext8 = callContext2;
                    Object obj19 = obj6;
                    Object obj20 = obj19;
                    if (!(obj19 instanceof Component)) {
                        return -786430;
                    }
                    callContext8.value2 = obj20;
                    CallContext callContext9 = callContext2;
                    Object obj21 = obj7;
                    Object obj22 = obj21;
                    if (!(obj21 instanceof String)) {
                        return -786429;
                    }
                    callContext9.value3 = obj22;
                    CallContext callContext10 = callContext2;
                    Object obj23 = obj8;
                    Object obj24 = obj23;
                    Object obj25 = obj23;
                    if (1 == 0) {
                        return -786428;
                    }
                    callContext10.value4 = obj24;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod2, obj5, obj6, obj7, obj8, callContext2);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            Throwable th;
            Throwable th2;
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj2 = obj;
            switch (moduleMethod2.selector) {
                case 1:
                    return this.$main.getSimpleName(obj2);
                case 2:
                    this.$main.androidLogForm(obj2);
                    return Values.empty;
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj2);
                    } catch (ClassCastException e) {
                        ClassCastException classCastException = e;
                        Throwable th3 = th2;
                        new WrongType(classCastException, "lookup-in-form-environment", 1, obj2);
                        throw th3;
                    }
                case 6:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj2) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        ClassCastException classCastException2 = e2;
                        Throwable th4 = th;
                        new WrongType(classCastException2, "is-bound-in-form-environment", 1, obj2);
                        throw th4;
                    }
                case 11:
                    this.$main.addToFormDoAfterCreation(obj2);
                    return Values.empty;
                case 12:
                    this.$main.sendError(obj2);
                    return Values.empty;
                case 13:
                    this.$main.processException(obj2);
                    return Values.empty;
                case 45:
                    return this.$main.Notifier1$AfterChoosing(obj2);
                case 48:
                    return this.$main.Side_Menu_Layout1$OnMenuItemClick(obj2);
                default:
                    return super.apply1(moduleMethod2, obj2);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            Throwable th;
            Throwable th2;
            Throwable th3;
            Throwable th4;
            Throwable th5;
            Throwable th6;
            Throwable th7;
            Throwable th8;
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj5 = obj;
            Object obj6 = obj2;
            Object obj7 = obj3;
            Object obj8 = obj4;
            switch (moduleMethod2.selector) {
                case 9:
                    this.$main.addToComponents(obj5, obj6, obj7, obj8);
                    return Values.empty;
                case 14:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj5, (String) obj6, (String) obj7, (Object[]) obj8) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    ClassCastException classCastException = e;
                                    Throwable th9 = th8;
                                    new WrongType(classCastException, "dispatchEvent", 4, obj8);
                                    throw th9;
                                }
                            } catch (ClassCastException e2) {
                                ClassCastException classCastException2 = e2;
                                Throwable th10 = th7;
                                new WrongType(classCastException2, "dispatchEvent", 3, obj7);
                                throw th10;
                            }
                        } catch (ClassCastException e3) {
                            ClassCastException classCastException3 = e3;
                            Throwable th11 = th6;
                            new WrongType(classCastException3, "dispatchEvent", 2, obj6);
                            throw th11;
                        }
                    } catch (ClassCastException e4) {
                        ClassCastException classCastException4 = e4;
                        Throwable th12 = th5;
                        new WrongType(classCastException4, "dispatchEvent", 1, obj5);
                        throw th12;
                    }
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    this.$main.dispatchGenericEvent((Component) obj5, (String) obj6, obj7 != Boolean.FALSE, (Object[]) obj8);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    ClassCastException classCastException5 = e5;
                                    Throwable th13 = th4;
                                    new WrongType(classCastException5, "dispatchGenericEvent", 4, obj8);
                                    throw th13;
                                }
                            } catch (ClassCastException e6) {
                                ClassCastException classCastException6 = e6;
                                Throwable th14 = th3;
                                new WrongType(classCastException6, "dispatchGenericEvent", 3, obj7);
                                throw th14;
                            }
                        } catch (ClassCastException e7) {
                            ClassCastException classCastException7 = e7;
                            Throwable th15 = th2;
                            new WrongType(classCastException7, "dispatchGenericEvent", 2, obj6);
                            throw th15;
                        }
                    } catch (ClassCastException e8) {
                        ClassCastException classCastException8 = e8;
                        Throwable th16 = th;
                        new WrongType(classCastException8, "dispatchGenericEvent", 1, obj5);
                        throw th16;
                    }
                default:
                    return super.apply4(moduleMethod2, obj5, obj6, obj7, obj8);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            Throwable th;
            Throwable th2;
            Throwable th3;
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj3 = obj;
            Object obj4 = obj2;
            switch (moduleMethod2.selector) {
                case 3:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj3, obj4);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        ClassCastException classCastException = e;
                        Throwable th4 = th3;
                        new WrongType(classCastException, "add-to-form-environment", 1, obj3);
                        throw th4;
                    }
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj3, obj4);
                    } catch (ClassCastException e2) {
                        ClassCastException classCastException2 = e2;
                        Throwable th5 = th2;
                        new WrongType(classCastException2, "lookup-in-form-environment", 1, obj3);
                        throw th5;
                    }
                case 7:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj3, obj4);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        ClassCastException classCastException3 = e3;
                        Throwable th6 = th;
                        new WrongType(classCastException3, "add-to-global-var-environment", 1, obj3);
                        throw th6;
                    }
                case 8:
                    this.$main.addToEvents(obj3, obj4);
                    return Values.empty;
                case 10:
                    this.$main.addToGlobalVars(obj3, obj4);
                    return Values.empty;
                case 16:
                    return this.$main.lookupHandler(obj3, obj4);
                default:
                    return super.apply2(moduleMethod2, obj3, obj4);
            }
        }
    }

    static Object lambda3() {
        SimpleSymbol simpleSymbol = Lit4;
        SimpleSymbol simpleSymbol2 = Lit5;
        Pair list1 = LList.list1("Home");
        Pair chain4 = LList.chain4(list1, "home.png", Boolean.TRUE, Boolean.FALSE, Lit6);
        Object callComponentMethod = C1223runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit7);
        SimpleSymbol simpleSymbol3 = Lit4;
        SimpleSymbol simpleSymbol4 = Lit5;
        Pair list12 = LList.list1("Join Telegram");
        Pair chain42 = LList.chain4(list12, "sss.png", Boolean.TRUE, Boolean.FALSE, Lit8);
        Object callComponentMethod2 = C1223runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, list12, Lit9);
        SimpleSymbol simpleSymbol5 = Lit4;
        SimpleSymbol simpleSymbol6 = Lit5;
        Pair list13 = LList.list1("Share");
        Pair chain43 = LList.chain4(list13, "share.png", Boolean.TRUE, Boolean.FALSE, Lit10);
        Object callComponentMethod3 = C1223runtime.callComponentMethod(simpleSymbol5, simpleSymbol6, list13, Lit11);
        SimpleSymbol simpleSymbol7 = Lit4;
        SimpleSymbol simpleSymbol8 = Lit5;
        Pair list14 = LList.list1("More Apps");
        Pair chain44 = LList.chain4(list14, "more.png", Boolean.TRUE, Boolean.FALSE, Lit12);
        Object callComponentMethod4 = C1223runtime.callComponentMethod(simpleSymbol7, simpleSymbol8, list14, Lit13);
        SimpleSymbol simpleSymbol9 = Lit4;
        SimpleSymbol simpleSymbol10 = Lit5;
        Pair list15 = LList.list1("Exit");
        Pair chain45 = LList.chain4(list15, "exit.png", Boolean.TRUE, Boolean.FALSE, Lit14);
        return C1223runtime.callComponentMethod(simpleSymbol9, simpleSymbol10, list15, Lit15);
    }

    static Procedure lambda4() {
        return lambda$Fn4;
    }

    static Object lambda5() {
        SimpleSymbol simpleSymbol = Lit4;
        SimpleSymbol simpleSymbol2 = Lit5;
        Pair list1 = LList.list1("Home");
        Pair chain4 = LList.chain4(list1, "home.png", Boolean.TRUE, Boolean.FALSE, Lit6);
        Object callComponentMethod = C1223runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit16);
        SimpleSymbol simpleSymbol3 = Lit4;
        SimpleSymbol simpleSymbol4 = Lit5;
        Pair list12 = LList.list1("Join Telegram");
        Pair chain42 = LList.chain4(list12, "sss.png", Boolean.TRUE, Boolean.FALSE, Lit8);
        Object callComponentMethod2 = C1223runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, list12, Lit17);
        SimpleSymbol simpleSymbol5 = Lit4;
        SimpleSymbol simpleSymbol6 = Lit5;
        Pair list13 = LList.list1("Share");
        Pair chain43 = LList.chain4(list13, "share.png", Boolean.TRUE, Boolean.FALSE, Lit10);
        Object callComponentMethod3 = C1223runtime.callComponentMethod(simpleSymbol5, simpleSymbol6, list13, Lit18);
        SimpleSymbol simpleSymbol7 = Lit4;
        SimpleSymbol simpleSymbol8 = Lit5;
        Pair list14 = LList.list1("More Apps");
        Pair chain44 = LList.chain4(list14, "more.png", Boolean.TRUE, Boolean.FALSE, Lit12);
        Object callComponentMethod4 = C1223runtime.callComponentMethod(simpleSymbol7, simpleSymbol8, list14, Lit19);
        SimpleSymbol simpleSymbol9 = Lit4;
        SimpleSymbol simpleSymbol10 = Lit5;
        Pair list15 = LList.list1("Exit");
        Pair chain45 = LList.chain4(list15, "exit.png", Boolean.TRUE, Boolean.FALSE, Lit14);
        return C1223runtime.callComponentMethod(simpleSymbol9, simpleSymbol10, list15, Lit20);
    }

    static Object lambda6() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "6182857846292480", Lit22);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "IndianSmartSMMPanel", Lit22);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Boolean.TRUE, Lit25);
        Object andCoerceProperty$Ex4 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit26, Lit27, Lit28);
        Object andCoerceProperty$Ex5 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit29, Lit30, Lit28);
        Object andCoerceProperty$Ex6 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit31, Lit32, Lit28);
        Object andCoerceProperty$Ex7 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit33, Boolean.TRUE, Lit25);
        Object andCoerceProperty$Ex8 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit34, "none", Lit22);
        Object andCoerceProperty$Ex9 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit35, Boolean.FALSE, Lit25);
        return C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit36, "Grow Follow", Lit22);
    }

    public Object main$Initialize() {
        C1223runtime.setThisForm();
        Object apply1 = Scheme.applyToArgs.apply1(C1223runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, C1223runtime.$Stthe$Mnnull$Mnvalue$St));
        Object callComponentMethod = C1223runtime.callComponentMethod(Lit37, Lit38, LList.list2(C1223runtime.lookupInCurrentFormEnvironment(Lit39), "Follow"), Lit40);
        Object callComponentMethod2 = C1223runtime.callComponentMethod(Lit37, Lit38, LList.list2(C1223runtime.lookupInCurrentFormEnvironment(Lit41), "Follow"), Lit42);
        Object callComponentMethod3 = C1223runtime.callComponentMethod(Lit37, Lit38, LList.list2(C1223runtime.lookupInCurrentFormEnvironment(Lit43), "Follow"), Lit44);
        return C1223runtime.callComponentMethod(Lit37, Lit38, LList.list2(C1223runtime.lookupInCurrentFormEnvironment(Lit45), "Follow"), Lit46);
    }

    public Object main$BackPressed() {
        C1223runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit49;
        SimpleSymbol simpleSymbol2 = Lit50;
        Pair list1 = LList.list1("Do you want to exit?");
        Pair chain4 = LList.chain4(list1, "Exit", "Yes", "", Boolean.TRUE);
        return C1223runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit51);
    }

    static Object lambda7() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit57, Lit58, Lit59, Lit28);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit57, Lit60, Lit59, Lit28);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit57, Lit61, "https://increasefollower.com/", Lit22);
        Object andCoerceProperty$Ex4 = C1223runtime.setAndCoerceProperty$Ex(Lit57, Lit62, Boolean.FALSE, Lit25);
        return C1223runtime.setAndCoerceProperty$Ex(Lit57, Lit63, Boolean.FALSE, Lit25);
    }

    static Object lambda8() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit57, Lit58, Lit59, Lit28);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit57, Lit60, Lit59, Lit28);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit57, Lit61, "https://increasefollower.com/", Lit22);
        Object andCoerceProperty$Ex4 = C1223runtime.setAndCoerceProperty$Ex(Lit57, Lit62, Boolean.FALSE, Lit25);
        return C1223runtime.setAndCoerceProperty$Ex(Lit57, Lit63, Boolean.FALSE, Lit25);
    }

    static Object lambda10() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit58, Lit59, Lit28);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit60, Lit59, Lit28);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit61, "http://igfollower.net/", Lit22);
        Object andCoerceProperty$Ex4 = C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit62, Boolean.FALSE, Lit25);
        return C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit63, Boolean.FALSE, Lit25);
    }

    static Object lambda9() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit58, Lit59, Lit28);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit60, Lit59, Lit28);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit61, "http://igfollower.net/", Lit22);
        Object andCoerceProperty$Ex4 = C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit62, Boolean.FALSE, Lit25);
        return C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit63, Boolean.FALSE, Lit25);
    }

    static Object lambda11() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit73, Lit58, Lit59, Lit28);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit73, Lit60, Lit59, Lit28);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit73, Lit61, "https://instahilecin.com/", Lit22);
        Object andCoerceProperty$Ex4 = C1223runtime.setAndCoerceProperty$Ex(Lit73, Lit62, Boolean.FALSE, Lit25);
        return C1223runtime.setAndCoerceProperty$Ex(Lit73, Lit63, Boolean.FALSE, Lit25);
    }

    static Object lambda12() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit73, Lit58, Lit59, Lit28);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit73, Lit60, Lit59, Lit28);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit73, Lit61, "https://instahilecin.com/", Lit22);
        Object andCoerceProperty$Ex4 = C1223runtime.setAndCoerceProperty$Ex(Lit73, Lit62, Boolean.FALSE, Lit25);
        return C1223runtime.setAndCoerceProperty$Ex(Lit73, Lit63, Boolean.FALSE, Lit25);
    }

    static Object lambda13() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit78, Lit58, Lit59, Lit28);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit78, Lit60, Lit59, Lit28);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit78, Lit61, "https://instahile.co/", Lit22);
        Object andCoerceProperty$Ex4 = C1223runtime.setAndCoerceProperty$Ex(Lit78, Lit62, Boolean.FALSE, Lit25);
        return C1223runtime.setAndCoerceProperty$Ex(Lit78, Lit63, Boolean.FALSE, Lit25);
    }

    static Object lambda14() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit78, Lit58, Lit59, Lit28);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit78, Lit60, Lit59, Lit28);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit78, Lit61, "https://instahile.co/", Lit22);
        Object andCoerceProperty$Ex4 = C1223runtime.setAndCoerceProperty$Ex(Lit78, Lit62, Boolean.FALSE, Lit25);
        return C1223runtime.setAndCoerceProperty$Ex(Lit78, Lit63, Boolean.FALSE, Lit25);
    }

    static Object lambda15() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit37, Lit58, Lit59, Lit28);
        return C1223runtime.setAndCoerceProperty$Ex(Lit37, Lit60, Lit59, Lit28);
    }

    static Object lambda16() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit37, Lit58, Lit59, Lit28);
        return C1223runtime.setAndCoerceProperty$Ex(Lit37, Lit60, Lit59, Lit28);
    }

    static Object lambda17() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit83, Lit84, Lit10, Lit28);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit83, Lit85, Lit8, Lit28);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit83, Lit58, Lit86, Lit28);
        return C1223runtime.setAndCoerceProperty$Ex(Lit83, Lit60, Lit59, Lit28);
    }

    static Object lambda18() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit83, Lit84, Lit10, Lit28);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit83, Lit85, Lit8, Lit28);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit83, Lit58, Lit86, Lit28);
        return C1223runtime.setAndCoerceProperty$Ex(Lit83, Lit60, Lit59, Lit28);
    }

    static Object lambda19() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit89, Lit90, "Made in India With Love ❤️", Lit22);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit89, Lit58, Lit59, Lit28);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit89, Lit60, Lit59, Lit28);
        Object andCoerceProperty$Ex4 = C1223runtime.setAndCoerceProperty$Ex(Lit89, Lit91, "Hint for Text_Box1", Lit22);
        Object andCoerceProperty$Ex5 = C1223runtime.setAndCoerceProperty$Ex(Lit89, Lit92, Boolean.TRUE, Lit25);
        Object andCoerceProperty$Ex6 = C1223runtime.setAndCoerceProperty$Ex(Lit89, Lit93, "Made in India With Love ❤️", Lit22);
        return C1223runtime.setAndCoerceProperty$Ex(Lit89, Lit94, Lit6, Lit28);
    }

    static Object lambda20() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit89, Lit90, "Made in India With Love ❤️", Lit22);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit89, Lit58, Lit59, Lit28);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit89, Lit60, Lit59, Lit28);
        Object andCoerceProperty$Ex4 = C1223runtime.setAndCoerceProperty$Ex(Lit89, Lit91, "Hint for Text_Box1", Lit22);
        Object andCoerceProperty$Ex5 = C1223runtime.setAndCoerceProperty$Ex(Lit89, Lit92, Boolean.TRUE, Lit25);
        Object andCoerceProperty$Ex6 = C1223runtime.setAndCoerceProperty$Ex(Lit89, Lit93, "Made in India With Love ❤️", Lit22);
        return C1223runtime.setAndCoerceProperty$Ex(Lit89, Lit94, Lit6, Lit28);
    }

    static Object lambda21() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit97, Lit84, Lit10, Lit28);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit97, Lit85, Lit8, Lit28);
        return C1223runtime.setAndCoerceProperty$Ex(Lit97, Lit60, Lit59, Lit28);
    }

    static Object lambda22() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit97, Lit84, Lit10, Lit28);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit97, Lit85, Lit8, Lit28);
        return C1223runtime.setAndCoerceProperty$Ex(Lit97, Lit60, Lit59, Lit28);
    }

    static Object lambda23() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit100, Lit101, Lit102, Lit28);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit100, Lit103, Boolean.TRUE, Lit25);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit100, Lit104, Lit105, Lit28);
        Object andCoerceProperty$Ex4 = C1223runtime.setAndCoerceProperty$Ex(Lit100, Lit58, Lit106, Lit28);
        Object andCoerceProperty$Ex5 = C1223runtime.setAndCoerceProperty$Ex(Lit100, Lit60, Lit107, Lit28);
        return C1223runtime.setAndCoerceProperty$Ex(Lit100, Lit93, "Get More Followers App", Lit22);
    }

    static Object lambda24() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit100, Lit101, Lit102, Lit28);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit100, Lit103, Boolean.TRUE, Lit25);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit100, Lit104, Lit105, Lit28);
        Object andCoerceProperty$Ex4 = C1223runtime.setAndCoerceProperty$Ex(Lit100, Lit58, Lit106, Lit28);
        Object andCoerceProperty$Ex5 = C1223runtime.setAndCoerceProperty$Ex(Lit100, Lit60, Lit107, Lit28);
        return C1223runtime.setAndCoerceProperty$Ex(Lit100, Lit93, "Get More Followers App", Lit22);
    }

    public Object Button1$Click() {
        C1223runtime.setThisForm();
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit109, Lit110, "android.intent.action.VIEW", Lit22);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit109, Lit111, "https://www.youtube.com/channel/UCzcd-A4D2GxCfqsfk0vtpFw", Lit22);
        return C1223runtime.callComponentMethod(Lit109, Lit112, LList.Empty, LList.Empty);
    }

    public Object Network1$OnDisconnect() {
        C1223runtime.setThisForm();
        return C1223runtime.callYailPrimitive(C1223runtime.open$Mnanother$Mnscreen, LList.list1("nointernet"), Lit118, "open another screen");
    }

    public Object Notifier1$AfterChoosing(Object $choice) {
        Object obj;
        Object $choice2 = C1223runtime.sanitizeComponentData($choice);
        C1223runtime.setThisForm();
        ModuleMethod moduleMethod = C1223runtime.yail$Mnequal$Qu;
        if ($choice2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1223runtime.getDisplayRepresentation(Lit123);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1223runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $choice2;
        }
        return C1223runtime.callYailPrimitive(moduleMethod, LList.list2(obj, "Yes"), Lit124, "=") != Boolean.FALSE ? C1223runtime.callYailPrimitive(C1223runtime.close$Mnapplication, LList.Empty, LList.Empty, "close application") : Values.empty;
    }

    static Object lambda25() {
        return C1223runtime.setAndCoerceProperty$Ex(Lit4, Lit128, "vibes-1024x683.png", Lit22);
    }

    static Object lambda26() {
        return C1223runtime.setAndCoerceProperty$Ex(Lit4, Lit128, "vibes-1024x683.png", Lit22);
    }

    public Object Side_Menu_Layout1$OnMenuItemClick(Object $title) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object $title2 = C1223runtime.sanitizeComponentData($title);
        C1223runtime.setThisForm();
        ModuleMethod moduleMethod = C1223runtime.yail$Mnequal$Qu;
        if ($title2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1223runtime.getDisplayRepresentation(Lit130);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1223runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $title2;
        }
        if (C1223runtime.callYailPrimitive(moduleMethod, LList.list2(obj, "Exit"), Lit131, "=") != Boolean.FALSE) {
            Object callYailPrimitive = C1223runtime.callYailPrimitive(C1223runtime.close$Mnapplication, LList.Empty, LList.Empty, "close application");
        }
        ModuleMethod moduleMethod2 = C1223runtime.yail$Mnequal$Qu;
        if ($title2 instanceof Package) {
            Object[] objArr4 = new Object[3];
            objArr4[0] = "The variable ";
            Object[] objArr5 = objArr4;
            objArr5[1] = C1223runtime.getDisplayRepresentation(Lit130);
            Object[] objArr6 = objArr5;
            objArr6[2] = " is not bound in the current context";
            obj2 = C1223runtime.signalRuntimeError(strings.stringAppend(objArr6), "Unbound Variable");
        } else {
            obj2 = $title2;
        }
        if (C1223runtime.callYailPrimitive(moduleMethod2, LList.list2(obj2, "Share"), Lit132, "=") != Boolean.FALSE) {
            Object callComponentMethod = C1223runtime.callComponentMethod(Lit133, Lit134, LList.list1("Download Latest Version Applications For FREE and Increase Real Followers and Likes From Here 👉 https://www.technomantu.in/"), Lit135);
        }
        ModuleMethod moduleMethod3 = C1223runtime.yail$Mnequal$Qu;
        if ($title2 instanceof Package) {
            Object[] objArr7 = new Object[3];
            objArr7[0] = "The variable ";
            Object[] objArr8 = objArr7;
            objArr8[1] = C1223runtime.getDisplayRepresentation(Lit130);
            Object[] objArr9 = objArr8;
            objArr9[2] = " is not bound in the current context";
            obj3 = C1223runtime.signalRuntimeError(strings.stringAppend(objArr9), "Unbound Variable");
        } else {
            obj3 = $title2;
        }
        if (C1223runtime.callYailPrimitive(moduleMethod3, LList.list2(obj3, "Home"), Lit136, "=") != Boolean.FALSE) {
            Object callComponentMethod2 = C1223runtime.callComponentMethod(Lit49, Lit137, LList.list1("just a Moment"), Lit138);
            Object callYailPrimitive2 = C1223runtime.callYailPrimitive(C1223runtime.open$Mnanother$Mnscreen, LList.list1("main"), Lit139, "open another screen");
        }
        ModuleMethod moduleMethod4 = C1223runtime.yail$Mnequal$Qu;
        if ($title2 instanceof Package) {
            Object[] objArr10 = new Object[3];
            objArr10[0] = "The variable ";
            Object[] objArr11 = objArr10;
            objArr11[1] = C1223runtime.getDisplayRepresentation(Lit130);
            Object[] objArr12 = objArr11;
            objArr12[2] = " is not bound in the current context";
            obj4 = C1223runtime.signalRuntimeError(strings.stringAppend(objArr12), "Unbound Variable");
        } else {
            obj4 = $title2;
        }
        if (C1223runtime.callYailPrimitive(moduleMethod4, LList.list2(obj4, "Join Telegram"), Lit140, "=") != Boolean.FALSE) {
            Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit109, Lit110, "android.intent.action.VIEW", Lit22);
            Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit109, Lit111, "https://t.me/s/facebookwalaguru", Lit22);
            Object callComponentMethod3 = C1223runtime.callComponentMethod(Lit109, Lit112, LList.Empty, LList.Empty);
        }
        ModuleMethod moduleMethod5 = C1223runtime.yail$Mnequal$Qu;
        if ($title2 instanceof Package) {
            Object[] objArr13 = new Object[3];
            objArr13[0] = "The variable ";
            Object[] objArr14 = objArr13;
            objArr14[1] = C1223runtime.getDisplayRepresentation(Lit130);
            Object[] objArr15 = objArr14;
            objArr15[2] = " is not bound in the current context";
            obj5 = C1223runtime.signalRuntimeError(strings.stringAppend(objArr15), "Unbound Variable");
        } else {
            obj5 = $title2;
        }
        if (C1223runtime.callYailPrimitive(moduleMethod5, LList.list2(obj5, "More Apps"), Lit141, "=") != Boolean.FALSE) {
            Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit109, Lit110, "android.intent.action.VIEW", Lit22);
            Object andCoerceProperty$Ex4 = C1223runtime.setAndCoerceProperty$Ex(Lit109, Lit111, "https://www.technomantu.in/", Lit22);
            obj6 = C1223runtime.callComponentMethod(Lit109, Lit112, LList.Empty, LList.Empty);
        } else {
            obj6 = Values.empty;
        }
        return obj6;
    }

    static Object lambda27() {
        return C1223runtime.setAndCoerceProperty$Ex(Lit133, Lit145, "Share Using...", Lit22);
    }

    static Object lambda28() {
        return C1223runtime.setAndCoerceProperty$Ex(Lit133, Lit145, "Share Using...", Lit22);
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol symbol, Object obj) {
        Symbol name = symbol;
        Object object = obj;
        Object[] objArr = new Object[4];
        objArr[0] = "Adding ~A to env ~A with value ~A";
        Object[] objArr2 = objArr;
        objArr2[1] = name;
        Object[] objArr3 = objArr2;
        objArr3[2] = this.form$Mnenvironment;
        Object[] objArr4 = objArr3;
        objArr4[3] = object;
        androidLogForm(Format.formatToString(0, objArr4));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol symbol, Object obj) {
        Object obj2;
        Symbol name = symbol;
        Object default$Mnvalue = obj;
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & true;
        if (!x ? !x : !this.form$Mnenvironment.isBound(name)) {
            obj2 = default$Mnvalue;
        } else {
            obj2 = this.form$Mnenvironment.get(name);
        }
        return obj2;
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol symbol, Object obj) {
        Symbol name = symbol;
        Object object = obj;
        Object[] objArr = new Object[4];
        objArr[0] = "Adding ~A to env ~A with value ~A";
        Object[] objArr2 = objArr;
        objArr2[1] = name;
        Object[] objArr3 = objArr2;
        objArr3[2] = this.global$Mnvar$Mnenvironment;
        Object[] objArr4 = objArr3;
        objArr4[3] = object;
        androidLogForm(Format.formatToString(0, objArr4));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = C1242lists.cons(C1242lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = C1242lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = C1242lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = C1242lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        Object obj = error;
        RetValManager.sendError(obj == null ? null : obj.toString());
    }

    public void processException(Object obj) {
        Object ex = obj;
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component component, String str, String str2, Object[] objArr) {
        boolean z;
        boolean z2;
        Component componentObject = component;
        String registeredComponentName = str;
        String eventName = str2;
        Object[] args = objArr;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            z = false;
        } else if (lookupInFormEnvironment(registeredObject) == componentObject) {
            try {
                Object apply2 = Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                z2 = true;
            } catch (PermissionException e) {
                PermissionException exception = e;
                exception.printStackTrace();
                boolean x = this == componentObject;
                if (!x ? !x : !IsEqual.apply(eventName, "PermissionNeeded")) {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                } else {
                    processException(exception);
                }
                z2 = false;
            } catch (Throwable th) {
                Throwable exception2 = th;
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                z2 = false;
            }
            z = z2;
        } else {
            z = false;
        }
        return z;
    }

    public void dispatchGenericEvent(Component component, String str, boolean z, Object[] objArr) {
        Boolean bool;
        Component componentObject = component;
        String eventName = str;
        boolean notAlreadyHandled = z;
        Object[] args = objArr;
        Object[] objArr2 = new Object[4];
        objArr2[0] = "any$";
        Object[] objArr3 = objArr2;
        objArr3[1] = getSimpleName(componentObject);
        Object[] objArr4 = objArr3;
        objArr4[2] = "$";
        Object[] objArr5 = objArr4;
        objArr5[3] = eventName;
        Object handler = lookupInFormEnvironment(misc.string$To$Symbol(strings.stringAppend(objArr5)));
        if (handler != Boolean.FALSE) {
            try {
                Apply apply = Scheme.apply;
                Object obj = handler;
                Component component2 = componentObject;
                if (notAlreadyHandled) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                Object apply2 = apply.apply2(obj, C1242lists.cons(component2, C1242lists.cons(bool, LList.makeList(args, 0))));
            } catch (PermissionException e) {
                PermissionException exception = e;
                exception.printStackTrace();
                boolean x = this == componentObject;
                if (!x ? !x : !IsEqual.apply(eventName, "PermissionNeeded")) {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                } else {
                    processException(exception);
                }
            } catch (Throwable th) {
                Throwable exception2 = th;
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object obj) {
        Object eventName = obj;
        Object obj2 = componentName;
        String obj3 = obj2 == null ? null : obj2.toString();
        Object obj4 = eventName;
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj3, obj4 == null ? null : obj4.toString())));
    }

    public void $define() {
        Object obj;
        Throwable th;
        Object obj2;
        Throwable th2;
        Object obj3;
        Throwable th3;
        Object obj4;
        Throwable th4;
        Object obj5;
        Throwable th5;
        Object obj6;
        Throwable th6;
        Object obj7;
        Throwable th7;
        Object obj8;
        Throwable th8;
        Throwable th9;
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception e) {
            Exception exception = e;
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        main = this;
        addToFormEnvironment(Lit0, this);
        Object obj9 = this.events$Mnto$Mnregister;
        while (true) {
            Object obj10 = obj9;
            if (obj10 == LList.Empty) {
                break;
            }
            Object obj11 = obj10;
            Object obj12 = obj11;
            try {
                Pair arg0 = (Pair) obj11;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = C1242lists.car.apply1(event$Mninfo);
                String obj13 = apply1 == null ? null : apply1.toString();
                Object apply12 = C1242lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj13, apply12 == null ? null : apply12.toString());
                obj9 = arg0.getCdr();
            } catch (ClassCastException e2) {
                ClassCastException classCastException = e2;
                Throwable th10 = th9;
                new WrongType(classCastException, "arg0", -2, obj12);
                throw th10;
            }
        }
        try {
            LList components = C1242lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            LList event$Mninfo2 = components;
            while (event$Mninfo2 != LList.Empty) {
                Object obj14 = event$Mninfo2;
                obj6 = obj14;
                Pair arg02 = (Pair) obj14;
                Object component$Mninfo = arg02.getCar();
                Object apply13 = C1242lists.caddr.apply1(component$Mninfo);
                Object apply14 = C1242lists.cadddr.apply1(component$Mninfo);
                Object component$Mntype = C1242lists.cadr.apply1(component$Mninfo);
                Object apply15 = C1242lists.car.apply1(component$Mninfo);
                obj7 = apply15;
                Object component$Mnname = apply13;
                Object component$Mnobject = Invoke.make.apply2(component$Mntype, lookupInFormEnvironment((Symbol) apply15));
                Object apply3 = SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                Object obj15 = component$Mnname;
                obj8 = obj15;
                addToFormEnvironment((Symbol) obj15, component$Mnobject);
                event$Mninfo2 = arg02.getCdr();
            }
            LList reverse = C1242lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            while (reverse != LList.Empty) {
                Object obj16 = reverse;
                obj4 = obj16;
                Pair arg03 = (Pair) obj16;
                Object var$Mnval = arg03.getCar();
                Object apply16 = C1242lists.car.apply1(var$Mnval);
                obj5 = apply16;
                addToGlobalVarEnvironment((Symbol) apply16, Scheme.applyToArgs.apply1(C1242lists.cadr.apply1(var$Mnval)));
                reverse = arg03.getCdr();
            }
            Object reverse2 = C1242lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (reverse2 != LList.Empty) {
                Object obj17 = reverse2;
                obj3 = obj17;
                Pair arg04 = (Pair) obj17;
                Object force = misc.force(arg04.getCar());
                reverse2 = arg04.getCdr();
            }
            LList component$Mndescriptors = components;
            LList lList = component$Mndescriptors;
            while (lList != LList.Empty) {
                Object obj18 = lList;
                obj2 = obj18;
                Pair arg05 = (Pair) obj18;
                Object component$Mninfo2 = arg05.getCar();
                Object apply17 = C1242lists.caddr.apply1(component$Mninfo2);
                Object init$Mnthunk = C1242lists.cadddr.apply1(component$Mninfo2);
                if (init$Mnthunk != Boolean.FALSE) {
                    Object apply18 = Scheme.applyToArgs.apply1(init$Mnthunk);
                }
                lList = arg05.getCdr();
            }
            LList lList2 = component$Mndescriptors;
            while (lList2 != LList.Empty) {
                Object obj19 = lList2;
                obj = obj19;
                Pair arg06 = (Pair) obj19;
                Object component$Mninfo3 = arg06.getCar();
                Object component$Mnname2 = C1242lists.caddr.apply1(component$Mninfo3);
                Object apply19 = C1242lists.cadddr.apply1(component$Mninfo3);
                callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                lList2 = arg06.getCdr();
            }
        } catch (ClassCastException e3) {
            ClassCastException classCastException2 = e3;
            Throwable th11 = th;
            new WrongType(classCastException2, "arg0", -2, obj);
            throw th11;
        } catch (ClassCastException e4) {
            ClassCastException classCastException3 = e4;
            Throwable th12 = th2;
            new WrongType(classCastException3, "arg0", -2, obj2);
            throw th12;
        } catch (ClassCastException e5) {
            ClassCastException classCastException4 = e5;
            Throwable th13 = th3;
            new WrongType(classCastException4, "arg0", -2, obj3);
            throw th13;
        } catch (ClassCastException e6) {
            ClassCastException classCastException5 = e6;
            Throwable th14 = th5;
            new WrongType(classCastException5, "add-to-global-var-environment", 0, obj5);
            throw th14;
        } catch (ClassCastException e7) {
            ClassCastException classCastException6 = e7;
            Throwable th15 = th4;
            new WrongType(classCastException6, "arg0", -2, obj4);
            throw th15;
        } catch (ClassCastException e8) {
            ClassCastException classCastException7 = e8;
            Throwable th16 = th8;
            new WrongType(classCastException7, "add-to-form-environment", 0, obj8);
            throw th16;
        } catch (ClassCastException e9) {
            ClassCastException classCastException8 = e9;
            Throwable th17 = th7;
            new WrongType(classCastException8, "lookup-in-form-environment", 0, obj7);
            throw th17;
        } catch (ClassCastException e10) {
            ClassCastException classCastException9 = e10;
            Throwable th18 = th6;
            new WrongType(classCastException9, "arg0", -2, obj6);
            throw th18;
        } catch (YailRuntimeError e11) {
            processException(e11);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        LList symbols = LList.makeList(argsArray, 0);
        LList lList = symbols;
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = symbols;
        Object obj2 = LList.Empty;
        while (true) {
            Object obj3 = obj2;
            Object obj4 = obj;
            if (obj4 == LList.Empty) {
                Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj3));
                Object obj5 = apply2;
                try {
                    return misc.string$To$Symbol((CharSequence) apply2);
                } catch (ClassCastException e) {
                    ClassCastException classCastException = e;
                    Throwable th4 = th;
                    new WrongType(classCastException, "string->symbol", 1, obj5);
                    throw th4;
                }
            } else {
                Object obj6 = obj4;
                Object obj7 = obj6;
                try {
                    Pair arg0 = (Pair) obj6;
                    obj = arg0.getCdr();
                    Object car = arg0.getCar();
                    Object obj8 = car;
                    try {
                        obj2 = Pair.make(misc.symbol$To$String((Symbol) car), obj3);
                    } catch (ClassCastException e2) {
                        ClassCastException classCastException2 = e2;
                        Throwable th5 = th3;
                        new WrongType(classCastException2, "symbol->string", 1, obj8);
                        throw th5;
                    }
                } catch (ClassCastException e3) {
                    ClassCastException classCastException3 = e3;
                    Throwable th6 = th2;
                    new WrongType(classCastException3, "arg0", -2, obj7);
                    throw th6;
                }
            }
        }
    }

    static Object lambda2() {
        return null;
    }
}
