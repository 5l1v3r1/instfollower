package p005io.kodular.themysteryman8308.MagicLiker;

import android.support.p000v4.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.KodularLottie;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Network;
import com.google.appinventor.components.runtime.SpaceView;
import com.google.appinventor.components.runtime.VerticalArrangement;
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
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.DFloNum;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.C1242lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;

/* renamed from: io.kodular.themysteryman8308.MagicLiker.Screen1 */
/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final IntNum Lit100 = IntNum.make(7000);
    static final FString Lit101;
    static final SimpleSymbol Lit102;
    static final SimpleSymbol Lit103;
    static final SimpleSymbol Lit104;
    static final SimpleSymbol Lit105;
    static final SimpleSymbol Lit106;
    static final SimpleSymbol Lit107;
    static final SimpleSymbol Lit108;
    static final SimpleSymbol Lit109;
    static final SimpleSymbol Lit11;
    static final SimpleSymbol Lit110;
    static final SimpleSymbol Lit111;
    static final SimpleSymbol Lit112;
    static final SimpleSymbol Lit113;
    static final SimpleSymbol Lit114;
    static final SimpleSymbol Lit115;
    static final SimpleSymbol Lit116;
    static final SimpleSymbol Lit12;
    static final SimpleSymbol Lit13;
    static final SimpleSymbol Lit14;
    static final SimpleSymbol Lit15;
    static final IntNum Lit16;
    static final SimpleSymbol Lit17;
    static final IntNum Lit18;
    static final SimpleSymbol Lit19;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final SimpleSymbol Lit21;
    static final SimpleSymbol Lit22;
    static final SimpleSymbol Lit23;
    static final SimpleSymbol Lit24;
    static final SimpleSymbol Lit25;
    static final SimpleSymbol Lit26;
    static final SimpleSymbol Lit27;
    static final SimpleSymbol Lit28;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final FString Lit30;
    static final SimpleSymbol Lit31;
    static final SimpleSymbol Lit32;
    static final IntNum Lit33 = IntNum.make(-1050);
    static final SimpleSymbol Lit34;
    static final IntNum Lit35 = IntNum.make(-2);
    static final FString Lit36;
    static final FString Lit37;
    static final SimpleSymbol Lit38;
    static final DFloNum Lit39 = DFloNum.make(0.5d);
    static final IntNum Lit4 = IntNum.make(3);
    static final FString Lit40;
    static final FString Lit41;
    static final SimpleSymbol Lit42;
    static final IntNum Lit43 = IntNum.make(-1008);
    static final IntNum Lit44 = IntNum.make(-1050);
    static final FString Lit45;
    static final FString Lit46;
    static final SimpleSymbol Lit47;
    static final SimpleSymbol Lit48;
    static final IntNum Lit49 = IntNum.make(30);
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final FString Lit51;
    static final FString Lit52;
    static final SimpleSymbol Lit53;
    static final IntNum Lit54 = IntNum.make(5);
    static final FString Lit55;
    static final FString Lit56;
    static final SimpleSymbol Lit57;
    static final IntNum Lit58 = IntNum.make(14);
    static final FString Lit59;
    static final SimpleSymbol Lit6;
    static final FString Lit60;
    static final SimpleSymbol Lit61;
    static final IntNum Lit62 = IntNum.make(10);
    static final FString Lit63;
    static final FString Lit64;
    static final IntNum Lit65 = IntNum.make(80);
    static final FString Lit66;
    static final FString Lit67;
    static final SimpleSymbol Lit68;
    static final SimpleSymbol Lit69;
    static final IntNum Lit7 = IntNum.make(2);
    static final IntNum Lit70;
    static final IntNum Lit71 = IntNum.make(20);
    static final IntNum Lit72 = IntNum.make(60);
    static final IntNum Lit73 = IntNum.make(-1070);
    static final SimpleSymbol Lit74;
    static final FString Lit75;
    static final PairWithPosition Lit76;
    static final SimpleSymbol Lit77;
    static final SimpleSymbol Lit78;
    static final FString Lit79;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit80;
    static final FString Lit81;
    static final FString Lit82;
    static final SimpleSymbol Lit83;
    static final DFloNum Lit84 = DFloNum.make(0.5d);
    static final IntNum Lit85 = IntNum.make(100);
    static final FString Lit86;
    static final FString Lit87;
    static final SimpleSymbol Lit88;
    static final FString Lit89;
    static final SimpleSymbol Lit9;
    static final FString Lit90;
    static final SimpleSymbol Lit91;
    static final SimpleSymbol Lit92;
    static final SimpleSymbol Lit93;
    static final IntNum Lit94 = IntNum.make(7000);
    static final FString Lit95;
    static final SimpleSymbol Lit96;
    static final SimpleSymbol Lit97;
    static final FString Lit98;
    static final SimpleSymbol Lit99;
    public static Screen1 Screen1;
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
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public Clock Clock2;
    public final ModuleMethod Clock2$Timer;
    public Clock Clock3;
    public final ModuleMethod Clock3$Timer;
    public Label Label1;
    public Label Label2;
    public KodularLottie Lottie1;
    public KodularLottie Lottie2;
    public KodularLottie Lottie3;
    public Network Network1;
    public final ModuleMethod Screen1$Initialize;
    public SpaceView Space2;
    public VerticalArrangement Vertical_Arrangement1;
    public VerticalArrangement Vertical_Arrangement3;
    public VerticalArrangement Vertical_Arrangement4;
    public VerticalArrangement Vertical_Arrangement5;
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
        FString fString;
        SimpleSymbol simpleSymbol16;
        FString fString2;
        SimpleSymbol simpleSymbol17;
        SimpleSymbol simpleSymbol18;
        FString fString3;
        SimpleSymbol simpleSymbol19;
        SimpleSymbol simpleSymbol20;
        SimpleSymbol simpleSymbol21;
        FString fString4;
        FString fString5;
        SimpleSymbol simpleSymbol22;
        FString fString6;
        FString fString7;
        SimpleSymbol simpleSymbol23;
        FString fString8;
        FString fString9;
        SimpleSymbol simpleSymbol24;
        FString fString10;
        SimpleSymbol simpleSymbol25;
        SimpleSymbol simpleSymbol26;
        SimpleSymbol simpleSymbol27;
        FString fString11;
        SimpleSymbol simpleSymbol28;
        SimpleSymbol simpleSymbol29;
        SimpleSymbol simpleSymbol30;
        FString fString12;
        FString fString13;
        FString fString14;
        FString fString15;
        SimpleSymbol simpleSymbol31;
        FString fString16;
        FString fString17;
        SimpleSymbol simpleSymbol32;
        FString fString18;
        FString fString19;
        SimpleSymbol simpleSymbol33;
        FString fString20;
        FString fString21;
        SimpleSymbol simpleSymbol34;
        SimpleSymbol simpleSymbol35;
        SimpleSymbol simpleSymbol36;
        FString fString22;
        FString fString23;
        SimpleSymbol simpleSymbol37;
        FString fString24;
        FString fString25;
        SimpleSymbol simpleSymbol38;
        FString fString26;
        FString fString27;
        SimpleSymbol simpleSymbol39;
        SimpleSymbol simpleSymbol40;
        SimpleSymbol simpleSymbol41;
        FString fString28;
        SimpleSymbol simpleSymbol42;
        SimpleSymbol simpleSymbol43;
        SimpleSymbol simpleSymbol44;
        SimpleSymbol simpleSymbol45;
        SimpleSymbol simpleSymbol46;
        SimpleSymbol simpleSymbol47;
        SimpleSymbol simpleSymbol48;
        SimpleSymbol simpleSymbol49;
        SimpleSymbol simpleSymbol50;
        SimpleSymbol simpleSymbol51;
        SimpleSymbol simpleSymbol52;
        SimpleSymbol simpleSymbol53;
        SimpleSymbol simpleSymbol54;
        SimpleSymbol simpleSymbol55;
        SimpleSymbol simpleSymbol56;
        SimpleSymbol simpleSymbol57;
        SimpleSymbol simpleSymbol58;
        SimpleSymbol simpleSymbol59;
        SimpleSymbol simpleSymbol60;
        SimpleSymbol simpleSymbol61;
        SimpleSymbol simpleSymbol62;
        SimpleSymbol simpleSymbol63;
        SimpleSymbol simpleSymbol64;
        SimpleSymbol simpleSymbol65;
        SimpleSymbol simpleSymbol66;
        new SimpleSymbol("lookup-handler");
        Lit116 = (SimpleSymbol) simpleSymbol.readResolve();
        new SimpleSymbol("dispatchGenericEvent");
        Lit115 = (SimpleSymbol) simpleSymbol2.readResolve();
        new SimpleSymbol("dispatchEvent");
        Lit114 = (SimpleSymbol) simpleSymbol3.readResolve();
        new SimpleSymbol("send-error");
        Lit113 = (SimpleSymbol) simpleSymbol4.readResolve();
        new SimpleSymbol("add-to-form-do-after-creation");
        Lit112 = (SimpleSymbol) simpleSymbol5.readResolve();
        new SimpleSymbol("add-to-global-vars");
        Lit111 = (SimpleSymbol) simpleSymbol6.readResolve();
        new SimpleSymbol("add-to-components");
        Lit110 = (SimpleSymbol) simpleSymbol7.readResolve();
        new SimpleSymbol("add-to-events");
        Lit109 = (SimpleSymbol) simpleSymbol8.readResolve();
        new SimpleSymbol("add-to-global-var-environment");
        Lit108 = (SimpleSymbol) simpleSymbol9.readResolve();
        new SimpleSymbol("is-bound-in-form-environment");
        Lit107 = (SimpleSymbol) simpleSymbol10.readResolve();
        new SimpleSymbol("lookup-in-form-environment");
        Lit106 = (SimpleSymbol) simpleSymbol11.readResolve();
        new SimpleSymbol("add-to-form-environment");
        Lit105 = (SimpleSymbol) simpleSymbol12.readResolve();
        new SimpleSymbol("android-log-form");
        Lit104 = (SimpleSymbol) simpleSymbol13.readResolve();
        new SimpleSymbol("get-simple-name");
        Lit103 = (SimpleSymbol) simpleSymbol14.readResolve();
        new SimpleSymbol("Clock3$Timer");
        Lit102 = (SimpleSymbol) simpleSymbol15.readResolve();
        new FString("com.google.appinventor.components.runtime.Clock");
        Lit101 = fString;
        new SimpleSymbol("Clock3");
        Lit99 = (SimpleSymbol) simpleSymbol16.readResolve();
        new FString("com.google.appinventor.components.runtime.Clock");
        Lit98 = fString2;
        new SimpleSymbol("Timer");
        Lit97 = (SimpleSymbol) simpleSymbol17.readResolve();
        new SimpleSymbol("Clock2$Timer");
        Lit96 = (SimpleSymbol) simpleSymbol18.readResolve();
        new FString("com.google.appinventor.components.runtime.Clock");
        Lit95 = fString3;
        new SimpleSymbol("TimerInterval");
        Lit93 = (SimpleSymbol) simpleSymbol19.readResolve();
        new SimpleSymbol("TimerAlwaysFires");
        Lit92 = (SimpleSymbol) simpleSymbol20.readResolve();
        new SimpleSymbol("Clock2");
        Lit91 = (SimpleSymbol) simpleSymbol21.readResolve();
        new FString("com.google.appinventor.components.runtime.Clock");
        Lit90 = fString4;
        new FString("com.google.appinventor.components.runtime.Network");
        Lit89 = fString5;
        new SimpleSymbol("Network1");
        Lit88 = (SimpleSymbol) simpleSymbol22.readResolve();
        new FString("com.google.appinventor.components.runtime.Network");
        Lit87 = fString6;
        new FString("com.google.appinventor.components.runtime.KodularLottie");
        Lit86 = fString7;
        new SimpleSymbol("Lottie2");
        Lit83 = (SimpleSymbol) simpleSymbol23.readResolve();
        new FString("com.google.appinventor.components.runtime.KodularLottie");
        Lit82 = fString8;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit81 = fString9;
        new SimpleSymbol("Vertical_Arrangement3");
        Lit80 = (SimpleSymbol) simpleSymbol24.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit79 = fString10;
        new SimpleSymbol("Click");
        Lit78 = (SimpleSymbol) simpleSymbol25.readResolve();
        new SimpleSymbol("Button1$Click");
        Lit77 = (SimpleSymbol) simpleSymbol26.readResolve();
        new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT);
        SimpleSymbol simpleSymbol67 = (SimpleSymbol) simpleSymbol27.readResolve();
        Lit9 = simpleSymbol67;
        Lit76 = PairWithPosition.make(simpleSymbol67, LList.Empty, "/tmp/1598816816957_0.3832455549052588-0/youngandroidproject/../src/io/kodular/themysteryman8308/MagicLiker/Screen1.yail", 503883);
        new FString("com.google.appinventor.components.runtime.Button");
        Lit75 = fString11;
        new SimpleSymbol("Visible");
        Lit74 = (SimpleSymbol) simpleSymbol28.readResolve();
        int[] iArr = new int[2];
        iArr[0] = -10060054;
        Lit70 = IntNum.make(iArr);
        new SimpleSymbol("BackgroundColor");
        Lit69 = (SimpleSymbol) simpleSymbol29.readResolve();
        new SimpleSymbol("Button1");
        Lit68 = (SimpleSymbol) simpleSymbol30.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit67 = fString12;
        new FString("com.google.appinventor.components.runtime.KodularLottie");
        Lit66 = fString13;
        new FString("com.google.appinventor.components.runtime.KodularLottie");
        Lit64 = fString14;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit63 = fString15;
        new SimpleSymbol("Vertical_Arrangement4");
        Lit61 = (SimpleSymbol) simpleSymbol31.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit60 = fString16;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit59 = fString17;
        new SimpleSymbol("Label2");
        Lit57 = (SimpleSymbol) simpleSymbol32.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit56 = fString18;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit55 = fString19;
        new SimpleSymbol("Space2");
        Lit53 = (SimpleSymbol) simpleSymbol33.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit52 = fString20;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit51 = fString21;
        new SimpleSymbol("Text");
        Lit50 = (SimpleSymbol) simpleSymbol34.readResolve();
        new SimpleSymbol("FontSize");
        Lit48 = (SimpleSymbol) simpleSymbol35.readResolve();
        new SimpleSymbol("Label1");
        Lit47 = (SimpleSymbol) simpleSymbol36.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit46 = fString22;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit45 = fString23;
        new SimpleSymbol("Vertical_Arrangement1");
        Lit42 = (SimpleSymbol) simpleSymbol37.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit41 = fString24;
        new FString("com.google.appinventor.components.runtime.KodularLottie");
        Lit40 = fString25;
        new SimpleSymbol("AnimationSpeed");
        Lit38 = (SimpleSymbol) simpleSymbol38.readResolve();
        new FString("com.google.appinventor.components.runtime.KodularLottie");
        Lit37 = fString26;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit36 = fString27;
        new SimpleSymbol("Width");
        Lit34 = (SimpleSymbol) simpleSymbol39.readResolve();
        new SimpleSymbol("Height");
        Lit32 = (SimpleSymbol) simpleSymbol40.readResolve();
        new SimpleSymbol("Vertical_Arrangement5");
        Lit31 = (SimpleSymbol) simpleSymbol41.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit30 = fString28;
        new SimpleSymbol("Initialize");
        Lit29 = (SimpleSymbol) simpleSymbol42.readResolve();
        new SimpleSymbol("Screen1$Initialize");
        Lit28 = (SimpleSymbol) simpleSymbol43.readResolve();
        new SimpleSymbol("Lottie3");
        Lit27 = (SimpleSymbol) simpleSymbol44.readResolve();
        new SimpleSymbol("Source");
        Lit26 = (SimpleSymbol) simpleSymbol45.readResolve();
        new SimpleSymbol("Lottie1");
        Lit25 = (SimpleSymbol) simpleSymbol46.readResolve();
        new SimpleSymbol("VersionName");
        Lit24 = (SimpleSymbol) simpleSymbol47.readResolve();
        new SimpleSymbol("TitleVisible");
        Lit23 = (SimpleSymbol) simpleSymbol48.readResolve();
        new SimpleSymbol("Title");
        Lit22 = (SimpleSymbol) simpleSymbol49.readResolve();
        new SimpleSymbol("ShowStatusBar");
        Lit21 = (SimpleSymbol) simpleSymbol50.readResolve();
        new SimpleSymbol("ShowOptionsMenu");
        Lit20 = (SimpleSymbol) simpleSymbol51.readResolve();
        new SimpleSymbol("RTLSupport");
        Lit19 = (SimpleSymbol) simpleSymbol52.readResolve();
        int[] iArr2 = new int[2];
        iArr2[0] = -10060054;
        Lit18 = IntNum.make(iArr2);
        new SimpleSymbol("PrimaryColorDark");
        Lit17 = (SimpleSymbol) simpleSymbol53.readResolve();
        int[] iArr3 = new int[2];
        iArr3[0] = -10060054;
        Lit16 = IntNum.make(iArr3);
        new SimpleSymbol("PrimaryColor");
        Lit15 = (SimpleSymbol) simpleSymbol54.readResolve();
        new SimpleSymbol("PackageName");
        Lit14 = (SimpleSymbol) simpleSymbol55.readResolve();
        new SimpleSymbol("Icon");
        Lit13 = (SimpleSymbol) simpleSymbol56.readResolve();
        new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN);
        Lit12 = (SimpleSymbol) simpleSymbol57.readResolve();
        new SimpleSymbol("HighQuality");
        Lit11 = (SimpleSymbol) simpleSymbol58.readResolve();
        new SimpleSymbol("AppName");
        Lit10 = (SimpleSymbol) simpleSymbol59.readResolve();
        new SimpleSymbol("AppId");
        Lit8 = (SimpleSymbol) simpleSymbol60.readResolve();
        new SimpleSymbol("AlignVertical");
        Lit6 = (SimpleSymbol) simpleSymbol61.readResolve();
        new SimpleSymbol("number");
        Lit5 = (SimpleSymbol) simpleSymbol62.readResolve();
        new SimpleSymbol("AlignHorizontal");
        Lit3 = (SimpleSymbol) simpleSymbol63.readResolve();
        new SimpleSymbol("*the-null-value*");
        Lit2 = (SimpleSymbol) simpleSymbol64.readResolve();
        new SimpleSymbol("getMessage");
        Lit1 = (SimpleSymbol) simpleSymbol65.readResolve();
        new SimpleSymbol("Screen1");
        Lit0 = (SimpleSymbol) simpleSymbol66.readResolve();
    }

    public Screen1() {
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
        ModuleInfo.register(this);
        ModuleMethod moduleMethod49 = moduleMethod;
        new frame();
        frame frame3 = frame2;
        frame3.$main = this;
        frame frame4 = frame3;
        new ModuleMethod(frame4, 1, Lit103, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.get$Mnsimple$Mnname = moduleMethod49;
        new ModuleMethod(frame4, 2, Lit104, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = moduleMethod2;
        new ModuleMethod(frame4, 3, Lit105, 8194);
        this.add$Mnto$Mnform$Mnenvironment = moduleMethod3;
        new ModuleMethod(frame4, 4, Lit106, 8193);
        this.lookup$Mnin$Mnform$Mnenvironment = moduleMethod4;
        new ModuleMethod(frame4, 6, Lit107, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = moduleMethod5;
        new ModuleMethod(frame4, 7, Lit108, 8194);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = moduleMethod6;
        new ModuleMethod(frame4, 8, Lit109, 8194);
        this.add$Mnto$Mnevents = moduleMethod7;
        new ModuleMethod(frame4, 9, Lit110, 16388);
        this.add$Mnto$Mncomponents = moduleMethod8;
        new ModuleMethod(frame4, 10, Lit111, 8194);
        this.add$Mnto$Mnglobal$Mnvars = moduleMethod9;
        new ModuleMethod(frame4, 11, Lit112, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = moduleMethod10;
        new ModuleMethod(frame4, 12, Lit113, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = moduleMethod11;
        new ModuleMethod(frame4, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = moduleMethod12;
        new ModuleMethod(frame4, 14, Lit114, 16388);
        this.dispatchEvent = moduleMethod13;
        new ModuleMethod(frame4, 15, Lit115, 16388);
        this.dispatchGenericEvent = moduleMethod14;
        new ModuleMethod(frame4, 16, Lit116, 8194);
        this.lookup$Mnhandler = moduleMethod15;
        new ModuleMethod(frame4, 17, (Object) null, 0);
        ModuleMethod moduleMethod50 = moduleMethod16;
        moduleMethod50.setProperty("source-location", "/tmp/runtime947713386790088419.scm:615");
        lambda$Fn1 = moduleMethod50;
        new ModuleMethod(frame4, 18, "$define", 0);
        this.$define = moduleMethod17;
        new ModuleMethod(frame4, 19, (Object) null, 0);
        lambda$Fn2 = moduleMethod18;
        new ModuleMethod(frame4, 20, Lit28, 0);
        this.Screen1$Initialize = moduleMethod19;
        new ModuleMethod(frame4, 21, (Object) null, 0);
        lambda$Fn3 = moduleMethod20;
        new ModuleMethod(frame4, 22, (Object) null, 0);
        lambda$Fn4 = moduleMethod21;
        new ModuleMethod(frame4, 23, (Object) null, 0);
        lambda$Fn5 = moduleMethod22;
        new ModuleMethod(frame4, 24, (Object) null, 0);
        lambda$Fn6 = moduleMethod23;
        new ModuleMethod(frame4, 25, (Object) null, 0);
        lambda$Fn7 = moduleMethod24;
        new ModuleMethod(frame4, 26, (Object) null, 0);
        lambda$Fn8 = moduleMethod25;
        new ModuleMethod(frame4, 27, (Object) null, 0);
        lambda$Fn9 = moduleMethod26;
        new ModuleMethod(frame4, 28, (Object) null, 0);
        lambda$Fn10 = moduleMethod27;
        new ModuleMethod(frame4, 29, (Object) null, 0);
        lambda$Fn11 = moduleMethod28;
        new ModuleMethod(frame4, 30, (Object) null, 0);
        lambda$Fn12 = moduleMethod29;
        new ModuleMethod(frame4, 31, (Object) null, 0);
        lambda$Fn13 = moduleMethod30;
        new ModuleMethod(frame4, 32, (Object) null, 0);
        lambda$Fn14 = moduleMethod31;
        new ModuleMethod(frame4, 33, (Object) null, 0);
        lambda$Fn15 = moduleMethod32;
        new ModuleMethod(frame4, 34, (Object) null, 0);
        lambda$Fn16 = moduleMethod33;
        new ModuleMethod(frame4, 35, (Object) null, 0);
        lambda$Fn17 = moduleMethod34;
        new ModuleMethod(frame4, 36, (Object) null, 0);
        lambda$Fn18 = moduleMethod35;
        new ModuleMethod(frame4, 37, (Object) null, 0);
        lambda$Fn19 = moduleMethod36;
        new ModuleMethod(frame4, 38, (Object) null, 0);
        lambda$Fn20 = moduleMethod37;
        new ModuleMethod(frame4, 39, Lit77, 0);
        this.Button1$Click = moduleMethod38;
        new ModuleMethod(frame4, 40, (Object) null, 0);
        lambda$Fn21 = moduleMethod39;
        new ModuleMethod(frame4, 41, (Object) null, 0);
        lambda$Fn22 = moduleMethod40;
        new ModuleMethod(frame4, 42, (Object) null, 0);
        lambda$Fn23 = moduleMethod41;
        new ModuleMethod(frame4, 43, (Object) null, 0);
        lambda$Fn24 = moduleMethod42;
        new ModuleMethod(frame4, 44, (Object) null, 0);
        lambda$Fn25 = moduleMethod43;
        new ModuleMethod(frame4, 45, (Object) null, 0);
        lambda$Fn26 = moduleMethod44;
        new ModuleMethod(frame4, 46, Lit96, 0);
        this.Clock2$Timer = moduleMethod45;
        new ModuleMethod(frame4, 47, (Object) null, 0);
        lambda$Fn27 = moduleMethod46;
        new ModuleMethod(frame4, 48, (Object) null, 0);
        lambda$Fn28 = moduleMethod47;
        new ModuleMethod(frame4, 49, Lit102, 0);
        this.Clock3$Timer = moduleMethod48;
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
        String obj;
        Object obj2;
        Consumer $result = $ctx.consumer;
        C1223runtime.$instance.run();
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
        Screen1 = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        C1223runtime.$instance.run();
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
            Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit5);
            Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "6182857846292480", Lit9);
            Object andCoerceProperty$Ex4 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "Grow Follow", Lit9);
            Object andCoerceProperty$Ex5 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Boolean.TRUE, Lit12);
            Object andCoerceProperty$Ex6 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "sfsdeghsg.jpg", Lit9);
            Object andCoerceProperty$Ex7 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "com.GrowFollow.android", Lit9);
            Object andCoerceProperty$Ex8 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Lit16, Lit5);
            Object andCoerceProperty$Ex9 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit17, Lit18, Lit5);
            Object andCoerceProperty$Ex10 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Boolean.TRUE, Lit12);
            Object andCoerceProperty$Ex11 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Boolean.FALSE, Lit12);
            Object andCoerceProperty$Ex12 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit21, Boolean.FALSE, Lit12);
            Object andCoerceProperty$Ex13 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "Grow Follow", Lit9);
            Object andCoerceProperty$Ex14 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit23, Boolean.FALSE, Lit12);
            Values.writeValues(C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit24, "1.1", Lit9), $result);
        } else {
            new Promise(lambda$Fn2);
            addToFormDoAfterCreation(obj2);
        }
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment = C1223runtime.addToCurrentFormEnvironment(Lit28, this.Screen1$Initialize);
        } else {
            addToFormEnvironment(Lit28, this.Screen1$Initialize);
        }
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1223runtime.$Stthis$Mnform$St, "Screen1", "Initialize");
        } else {
            addToEvents(Lit0, Lit29);
        }
        this.Vertical_Arrangement5 = null;
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit30, Lit31, lambda$Fn3), $result);
        } else {
            addToComponents(Lit0, Lit36, Lit31, lambda$Fn4);
        }
        this.Lottie3 = null;
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1223runtime.addComponentWithinRepl(Lit31, Lit37, Lit27, lambda$Fn5), $result);
        } else {
            addToComponents(Lit31, Lit40, Lit27, lambda$Fn6);
        }
        this.Vertical_Arrangement1 = null;
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit41, Lit42, lambda$Fn7), $result);
        } else {
            addToComponents(Lit0, Lit45, Lit42, lambda$Fn8);
        }
        this.Label1 = null;
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1223runtime.addComponentWithinRepl(Lit42, Lit46, Lit47, lambda$Fn9), $result);
        } else {
            addToComponents(Lit42, Lit51, Lit47, lambda$Fn10);
        }
        this.Space2 = null;
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1223runtime.addComponentWithinRepl(Lit42, Lit52, Lit53, lambda$Fn11), $result);
        } else {
            addToComponents(Lit42, Lit55, Lit53, lambda$Fn12);
        }
        this.Label2 = null;
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1223runtime.addComponentWithinRepl(Lit42, Lit56, Lit57, lambda$Fn13), $result);
        } else {
            addToComponents(Lit42, Lit59, Lit57, lambda$Fn14);
        }
        this.Vertical_Arrangement4 = null;
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit60, Lit61, lambda$Fn15), $result);
        } else {
            addToComponents(Lit0, Lit63, Lit61, lambda$Fn16);
        }
        this.Lottie1 = null;
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit64, Lit25, lambda$Fn17), $result);
        } else {
            addToComponents(Lit0, Lit66, Lit25, lambda$Fn18);
        }
        this.Button1 = null;
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit67, Lit68, lambda$Fn19), $result);
        } else {
            addToComponents(Lit0, Lit75, Lit68, lambda$Fn20);
        }
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment2 = C1223runtime.addToCurrentFormEnvironment(Lit77, this.Button1$Click);
        } else {
            addToFormEnvironment(Lit77, this.Button1$Click);
        }
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1223runtime.$Stthis$Mnform$St, "Button1", "Click");
        } else {
            addToEvents(Lit68, Lit78);
        }
        this.Vertical_Arrangement3 = null;
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit79, Lit80, lambda$Fn21), $result);
        } else {
            addToComponents(Lit0, Lit81, Lit80, lambda$Fn22);
        }
        this.Lottie2 = null;
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1223runtime.addComponentWithinRepl(Lit80, Lit82, Lit83, lambda$Fn23), $result);
        } else {
            addToComponents(Lit80, Lit86, Lit83, lambda$Fn24);
        }
        this.Network1 = null;
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit87, Lit88, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit89, Lit88, Boolean.FALSE);
        }
        this.Clock2 = null;
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit90, Lit91, lambda$Fn25), $result);
        } else {
            addToComponents(Lit0, Lit95, Lit91, lambda$Fn26);
        }
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment3 = C1223runtime.addToCurrentFormEnvironment(Lit96, this.Clock2$Timer);
        } else {
            addToFormEnvironment(Lit96, this.Clock2$Timer);
        }
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1223runtime.$Stthis$Mnform$St, "Clock2", "Timer");
        } else {
            addToEvents(Lit91, Lit97);
        }
        this.Clock3 = null;
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1223runtime.addComponentWithinRepl(Lit0, Lit98, Lit99, lambda$Fn27), $result);
        } else {
            addToComponents(Lit0, Lit101, Lit99, lambda$Fn28);
        }
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment4 = C1223runtime.addToCurrentFormEnvironment(Lit102, this.Clock3$Timer);
        } else {
            addToFormEnvironment(Lit102, this.Clock3$Timer);
        }
        if (C1223runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1223runtime.$Stthis$Mnform$St, "Clock3", "Timer");
        } else {
            addToEvents(Lit99, Lit97);
        }
        C1223runtime.initRuntime();
    }

    static Object lambda3() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit5);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "6182857846292480", Lit9);
        Object andCoerceProperty$Ex4 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "Grow Follow", Lit9);
        Object andCoerceProperty$Ex5 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Boolean.TRUE, Lit12);
        Object andCoerceProperty$Ex6 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "sfsdeghsg.jpg", Lit9);
        Object andCoerceProperty$Ex7 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "com.GrowFollow.android", Lit9);
        Object andCoerceProperty$Ex8 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Lit16, Lit5);
        Object andCoerceProperty$Ex9 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit17, Lit18, Lit5);
        Object andCoerceProperty$Ex10 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Boolean.TRUE, Lit12);
        Object andCoerceProperty$Ex11 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Boolean.FALSE, Lit12);
        Object andCoerceProperty$Ex12 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit21, Boolean.FALSE, Lit12);
        Object andCoerceProperty$Ex13 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "Grow Follow", Lit9);
        Object andCoerceProperty$Ex14 = C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit23, Boolean.FALSE, Lit12);
        return C1223runtime.setAndCoerceProperty$Ex(Lit0, Lit24, "1.1", Lit9);
    }

    public Object Screen1$Initialize() {
        C1223runtime.setThisForm();
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit25, Lit26, "https://assets9.lottiefiles.com/packages/lf20_utWSB7.json", Lit9);
        return C1223runtime.setAndCoerceProperty$Ex(Lit27, Lit26, "https://assets2.lottiefiles.com/private_files/lf30_bcVsEA.json", Lit9);
    }

    static Object lambda4() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit31, Lit3, Lit4, Lit5);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit31, Lit6, Lit7, Lit5);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit31, Lit32, Lit33, Lit5);
        return C1223runtime.setAndCoerceProperty$Ex(Lit31, Lit34, Lit35, Lit5);
    }

    static Object lambda5() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit31, Lit3, Lit4, Lit5);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit31, Lit6, Lit7, Lit5);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit31, Lit32, Lit33, Lit5);
        return C1223runtime.setAndCoerceProperty$Ex(Lit31, Lit34, Lit35, Lit5);
    }

    static Object lambda6() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit27, Lit38, Lit39, Lit5);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit27, Lit32, Lit35, Lit5);
        return C1223runtime.setAndCoerceProperty$Ex(Lit27, Lit34, Lit35, Lit5);
    }

    static Object lambda7() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit27, Lit38, Lit39, Lit5);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit27, Lit32, Lit35, Lit5);
        return C1223runtime.setAndCoerceProperty$Ex(Lit27, Lit34, Lit35, Lit5);
    }

    static Object lambda8() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit42, Lit3, Lit4, Lit5);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit42, Lit32, Lit43, Lit5);
        return C1223runtime.setAndCoerceProperty$Ex(Lit42, Lit34, Lit44, Lit5);
    }

    static Object lambda9() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit42, Lit3, Lit4, Lit5);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit42, Lit32, Lit43, Lit5);
        return C1223runtime.setAndCoerceProperty$Ex(Lit42, Lit34, Lit44, Lit5);
    }

    static Object lambda10() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit47, Lit48, Lit49, Lit5);
        return C1223runtime.setAndCoerceProperty$Ex(Lit47, Lit50, "Grow Follow", Lit9);
    }

    static Object lambda11() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit47, Lit48, Lit49, Lit5);
        return C1223runtime.setAndCoerceProperty$Ex(Lit47, Lit50, "Grow Follow", Lit9);
    }

    static Object lambda12() {
        return C1223runtime.setAndCoerceProperty$Ex(Lit53, Lit32, Lit54, Lit5);
    }

    static Object lambda13() {
        return C1223runtime.setAndCoerceProperty$Ex(Lit53, Lit32, Lit54, Lit5);
    }

    static Object lambda14() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit57, Lit48, Lit58, Lit5);
        return C1223runtime.setAndCoerceProperty$Ex(Lit57, Lit50, "Version 1.1", Lit9);
    }

    static Object lambda15() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit57, Lit48, Lit58, Lit5);
        return C1223runtime.setAndCoerceProperty$Ex(Lit57, Lit50, "Version 1.1", Lit9);
    }

    static Object lambda16() {
        return C1223runtime.setAndCoerceProperty$Ex(Lit61, Lit32, Lit62, Lit5);
    }

    static Object lambda17() {
        return C1223runtime.setAndCoerceProperty$Ex(Lit61, Lit32, Lit62, Lit5);
    }

    static Object lambda18() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit25, Lit32, Lit65, Lit5);
        return C1223runtime.setAndCoerceProperty$Ex(Lit25, Lit34, Lit35, Lit5);
    }

    static Object lambda19() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit25, Lit32, Lit65, Lit5);
        return C1223runtime.setAndCoerceProperty$Ex(Lit25, Lit34, Lit35, Lit5);
    }

    static Object lambda20() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit69, Lit70, Lit5);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit48, Lit71, Lit5);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit32, Lit72, Lit5);
        Object andCoerceProperty$Ex4 = C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit34, Lit73, Lit5);
        Object andCoerceProperty$Ex5 = C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit50, "Grow Follow", Lit9);
        return C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit74, Boolean.FALSE, Lit12);
    }

    static Object lambda21() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit69, Lit70, Lit5);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit48, Lit71, Lit5);
        Object andCoerceProperty$Ex3 = C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit32, Lit72, Lit5);
        Object andCoerceProperty$Ex4 = C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit34, Lit73, Lit5);
        Object andCoerceProperty$Ex5 = C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit50, "Grow Follow", Lit9);
        return C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit74, Boolean.FALSE, Lit12);
    }

    public Object Button1$Click() {
        C1223runtime.setThisForm();
        return C1223runtime.callYailPrimitive(C1223runtime.open$Mnanother$Mnscreen, LList.list1("main"), Lit76, "open another screen");
    }

    static Object lambda22() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit80, Lit3, Lit4, Lit5);
        return C1223runtime.setAndCoerceProperty$Ex(Lit80, Lit34, Lit35, Lit5);
    }

    static Object lambda23() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit80, Lit3, Lit4, Lit5);
        return C1223runtime.setAndCoerceProperty$Ex(Lit80, Lit34, Lit35, Lit5);
    }

    static Object lambda24() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit83, Lit38, Lit84, Lit5);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit83, Lit32, Lit85, Lit5);
        return C1223runtime.setAndCoerceProperty$Ex(Lit83, Lit34, Lit85, Lit5);
    }

    static Object lambda25() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit83, Lit38, Lit84, Lit5);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit83, Lit32, Lit85, Lit5);
        return C1223runtime.setAndCoerceProperty$Ex(Lit83, Lit34, Lit85, Lit5);
    }

    static Object lambda26() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit91, Lit92, Boolean.FALSE, Lit12);
        return C1223runtime.setAndCoerceProperty$Ex(Lit91, Lit93, Lit94, Lit5);
    }

    static Object lambda27() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit91, Lit92, Boolean.FALSE, Lit12);
        return C1223runtime.setAndCoerceProperty$Ex(Lit91, Lit93, Lit94, Lit5);
    }

    public Object Clock2$Timer() {
        C1223runtime.setThisForm();
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit68, Lit74, Boolean.TRUE, Lit12);
        Object andCoerceProperty$Ex2 = C1223runtime.setAndCoerceProperty$Ex(Lit83, Lit26, "https://assets7.lottiefiles.com/temp/lf20_mhBFdl.json", Lit9);
        return C1223runtime.setAndCoerceProperty$Ex(Lit83, Lit74, Boolean.TRUE, Lit12);
    }

    static Object lambda28() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit99, Lit92, Boolean.FALSE, Lit12);
        return C1223runtime.setAndCoerceProperty$Ex(Lit99, Lit93, Lit100, Lit5);
    }

    static Object lambda29() {
        Object andCoerceProperty$Ex = C1223runtime.setAndCoerceProperty$Ex(Lit99, Lit92, Boolean.FALSE, Lit12);
        return C1223runtime.setAndCoerceProperty$Ex(Lit99, Lit93, Lit100, Lit5);
    }

    public Object Clock3$Timer() {
        C1223runtime.setThisForm();
        return C1223runtime.setAndCoerceProperty$Ex(Lit25, Lit74, Boolean.FALSE, Lit12);
    }

    /* renamed from: io.kodular.themysteryman8308.MagicLiker.Screen1$frame */
    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main;

        public frame() {
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
                    if (!(obj7 instanceof Screen1)) {
                        return -786431;
                    }
                    callContext5.value1 = obj8;
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
                    if (!(obj9 instanceof Screen1)) {
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
                    if (!(obj17 instanceof Screen1)) {
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

        public Object apply0(ModuleMethod moduleMethod) {
            ModuleMethod moduleMethod2 = moduleMethod;
            switch (moduleMethod2.selector) {
                case 17:
                    return Screen1.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return Screen1.lambda3();
                case 20:
                    return this.$main.Screen1$Initialize();
                case 21:
                    return Screen1.lambda4();
                case 22:
                    return Screen1.lambda5();
                case 23:
                    return Screen1.lambda6();
                case 24:
                    return Screen1.lambda7();
                case 25:
                    return Screen1.lambda8();
                case 26:
                    return Screen1.lambda9();
                case 27:
                    return Screen1.lambda10();
                case 28:
                    return Screen1.lambda11();
                case 29:
                    return Screen1.lambda12();
                case 30:
                    return Screen1.lambda13();
                case 31:
                    return Screen1.lambda14();
                case 32:
                    return Screen1.lambda15();
                case 33:
                    return Screen1.lambda16();
                case 34:
                    return Screen1.lambda17();
                case 35:
                    return Screen1.lambda18();
                case 36:
                    return Screen1.lambda19();
                case 37:
                    return Screen1.lambda20();
                case 38:
                    return Screen1.lambda21();
                case 39:
                    return this.$main.Button1$Click();
                case 40:
                    return Screen1.lambda22();
                case 41:
                    return Screen1.lambda23();
                case 42:
                    return Screen1.lambda24();
                case 43:
                    return Screen1.lambda25();
                case 44:
                    return Screen1.lambda26();
                case 45:
                    return Screen1.lambda27();
                case 46:
                    return this.$main.Clock2$Timer();
                case 47:
                    return Screen1.lambda28();
                case 48:
                    return Screen1.lambda29();
                case 49:
                    return this.$main.Clock3$Timer();
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
                case 45:
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
                case 48:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                case 49:
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod2, callContext2);
            }
        }
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
        Screen1 = this;
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
