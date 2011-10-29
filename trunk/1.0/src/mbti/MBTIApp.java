/*
 * MBTIApp.java
 */

package mbti;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class MBTIApp extends SingleFrameApplication {

    
    
    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        
        InitStepAll();
        
        show(new MBTIView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of MBTIApp
     */
    public static MBTIApp getApplication() {
        return Application.getInstance(MBTIApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(MBTIApp.class, args);
    }
    
    public static MBTIParameter MBTIRuslt = new MBTIParameter();
    public static int stepIndex = 0;
    public static int questionIndex = 0;
    public static MBTIQuestion[][] StepAll;
    private static MBTIQuestion[] Step1;
    private static MBTIQuestion[] Step2;
    private static MBTIQuestion[] Step3;
    private static MBTIQuestion[] Step4;
    
    /*
     * 初始化测试参数
     */
    public static void InitMBTI(){
        
        MBTIRuslt.Init();
        stepIndex = 0;
        questionIndex = 0;
    }

    private static void InitStepAll()
    {
        InitStep1();
        InitStep2();
        InitStep3();
        InitStep4();
        StepAll = new MBTIQuestion[][]{Step1, Step2, Step3, Step4};
    }
    private static void InitStep1(){

        Step1 = new MBTIQuestion[26];
        //1-5
        /* 01 */
        Step1[0] = new MBTIQuestion("当我某日想去一个地方时，我通常会", "去之前先想好该做的事", "去了再说", 'J', 'P');
        /* 02 */
        Step1[1] = new MBTIQuestion("我觉得自己更倾向于是一个", "随遇而安的人", "做事遵循计划的人", 'S', 'N');
        /* 03 */
        Step1[2] = new MBTIQuestion("如果我是一位老师的话，我更喜欢教", "偏重于事实的课程", "偏重于理论的课程", 'E', 'I');
        /* 04 */
        Step1[3] = new MBTIQuestion("我通常是一个", "容易和大家打成一片的人", "说话不是很多的人", 'J', 'P');
        /* 05 */
        Step1[4] = new MBTIQuestion("我通常和_____相处较好", "爱想象的人", "现实的人", 'N', 'S');
        //6-10
        /* 06 */
        Step1[5] = new MBTIQuestion("我觉得自己更是一个", "重情感的人", "重理智的人", 'F', 'T');
        /* 07 */
        Step1[6] = new MBTIQuestion("我更喜欢", "按兴致做事情", "按计划做事情", 'E', 'I');
        /* 08 */
        Step1[7] = new MBTIQuestion("我", "很容易被别人理解", "很难被别人理解", 'P', 'J');
        /* 09 */
        Step1[8] = new MBTIQuestion("按日程表做事", "正合我意", "束缚了我", 'S', 'N');
        /* 10 */
        Step1[9] = new MBTIQuestion("当有一件具体的工作要做时，我喜欢", "事先就规划好，写下时间表", "边做边调整", 'E', 'I');
        //11-15
        /* 11 */
        Step1[10] = new MBTIQuestion("在多数情况下，我更喜欢", "想到哪做到哪", "按日程表执行", 'N', 'S');
        /* 12 */
        Step1[11] = new MBTIQuestion("大多数人说我是一个", "不太把事情告诉别人的人", "畅所欲言的人", 'J', 'P');
        /* 13 */
        Step1[12] = new MBTIQuestion("我更愿意被别人看成是", "一个注重实际的人", "一个足智多谋的人", 'I', 'E');
        /* 14 */
        Step1[13] = new MBTIQuestion("在一群人中，我通常", "容易主动去结识新朋友", "更多时候等着别人来认识我", 'J', 'P');
        /* 15 */
        Step1[14] = new MBTIQuestion("我更愿意和____交朋友", "总能有创新想法的人", "脚踏实地的人", 'F', 'T');
        //16-20
        /* 16 */
        Step1[15] = new MBTIQuestion("决策时，我更倾向于", "考虑人的因素", "考虑事情本身", 'I', 'E');
        /* 17 */
        Step1[16] = new MBTIQuestion("我做事情更喜欢", "先看一看有什么新情况后再作打算", "尽早就把事情定下来", 'P', 'J');
        /* 18 */
        Step1[17] = new MBTIQuestion("更多的时候，我喜欢", "自己一个人呆着", "和他人在一起", 'N', 'S');
        /* 19 */
        Step1[18] = new MBTIQuestion("身边有很多人", "会令我变得更有精神", "会令我感到疲于应付", 'E', 'I');
        /* 20 */
        Step1[19] = new MBTIQuestion("我更喜欢", "早一点就把聚会或活动的时间定下来", "到时候再定", 'J', 'P');
        //21-25
        /* 21 */
        Step1[20] = new MBTIQuestion("在旅行时，我更喜欢", "根据情况安排活动", "事先就想清楚一整天的活动", 'F', 'T');
        /* 22 */
        Step1[21] = new MBTIQuestion("在聚会活动中，我往往", "会感到厌烦、疲倦", "能过得高兴、尽兴", 'N', 'S');
        /* 23 */
        Step1[22] = new MBTIQuestion("我更喜欢", "和他人交往", "和自己的内心交流", 'E', 'I');
        /* 24 */
        Step1[23] = new MBTIQuestion("我更喜欢和____的人打交道", "想法新奇、思维敏捷的人", "讲话有根有据、遵循常理的人", 'P', 'J');
        /* 25 */
        Step1[24] = new MBTIQuestion("在日常工作中，我更喜欢", "在时间紧迫的情况下，争分夺秒地工作", "早作计划并尽早完成，以免在压力下工作", 'S', 'N');
        //26
        /* 26 */
        Step1[25] = new MBTIQuestion("我觉得别人通常", "要花较长的时间才能和我熟悉起来", "很快就能和我熟悉起来", 'I', 'E');
    }
    private static void InitStep2(){

        Step2 = new MBTIQuestion[27];
        //1-5
        /* 27 */
        Step2[0] = new MBTIQuestion("", "实际的", "理论的", 'N', 'S');
        /* 28 */
        Step2[1] = new MBTIQuestion("", "少许朋友", "许多朋友", 'J', 'P');
        /* 29 */
        Step2[2] = new MBTIQuestion("", "井井有条", "即兴随意", 'F', 'T');
        /* 30 */
        Step2[3] = new MBTIQuestion("", "想象出来的", "现实存在的", 'S', 'N');
        /* 31 */
        Step2[4] = new MBTIQuestion("", "温暖的", "客观的", 'T', 'F');
        //6-10
        /* 32 */
        Step2[5] = new MBTIQuestion("", "公正的", "热情的", 'E', 'I');
        /* 33 */
        Step2[6] = new MBTIQuestion("", "建造", "发明", 'T', 'F');
        /* 34 */
        Step2[7] = new MBTIQuestion("", "安静的", "好交际的", 'S', 'N');
        /* 35 */
        Step2[8] = new MBTIQuestion("", "理论", "事实", 'T', 'F');
        /* 36 */
        Step2[9] = new MBTIQuestion("", "同情怜悯", "逻辑法则", 'J', 'P');
        //11-15
        /* 37 */
        Step2[10] = new MBTIQuestion("", "分析", "感受", 'F', 'T');
        /* 38 */
        Step2[11] = new MBTIQuestion("", "理智多思", "细腻善感", 'I', 'E');
        /* 39 */
        Step2[12] = new MBTIQuestion("", "想象", "实际", 'S', 'N');
        /* 40 */
        Step2[13] = new MBTIQuestion("", "慷慨的", "坚定的", 'F', 'T');
        /* 41 */
        Step2[14] = new MBTIQuestion("", "一视同仁", "体恤照顾", 'J', 'P');
        //16-20
        /* 42 */
        Step2[15] = new MBTIQuestion("", "生产", "创作", 'I', 'E');
        /* 43 */
        Step2[16] = new MBTIQuestion("", "可能的", "必然的", 'T', 'F');
        /* 44 */
        Step2[17] = new MBTIQuestion("", "关心温暖", "坚强有力", 'N', 'S');
        /* 45 */
        Step2[18] = new MBTIQuestion("", "实用价值", "情感需要", 'T', 'F');
        /* 46 */
        Step2[19] = new MBTIQuestion("", "制作", "设计", 'N', 'S');
        //21-25
        /* 47 */
        Step2[20] = new MBTIQuestion("", "新奇的", "已知的", 'T', 'F');
        /* 48 */
        Step2[21] = new MBTIQuestion("", "同情", "分析", 'N', 'S');
        /* 49 */
        Step2[22] = new MBTIQuestion("", "坚定的", "心肠软的", 'T', 'F');
        /* 50 */
        Step2[23] = new MBTIQuestion("", "直观", "抽象", 'S', 'N');
        /* 51 */
        Step2[24] = new MBTIQuestion("", "忠诚", "坚定", 'F', 'T');
        //26-27
        /* 52 */
        Step2[25] = new MBTIQuestion("", "竞争性", "好心肠", 'S', 'N');
        /* 53 */
        Step2[26] = new MBTIQuestion("", "实用性", "创新性", 'F', 'T');
    }
    private static void InitStep3(){

        Step3 = new MBTIQuestion[20];
        //1-5
        /* 54 */
        Step3[0] = new MBTIQuestion("当我有一项重要工作需要在一个星期内完成时，我会", "事先写下具体的步骤和时间", "直接开始做", 'S', 'N');
        /* 55 */
        Step3[1] = new MBTIQuestion("对我来说，在社交场合主动和别人说话或总能有话说", "是件蛮难的事", "是一件很轻松的事", 'P', 'J');
        /* 56 */
        Step3[2] = new MBTIQuestion("做一件很多人都做的事情时，我喜欢", "按常规方法去做", "自己想出一种新方法", 'T', 'F');
        /* 57 */
        Step3[3] = new MBTIQuestion("新认识我的人一般", "较快就能知道我的兴趣所在", "只有在真正和我熟悉之后才会知道我的兴趣", 'I', 'E');
        /* 58 */
        Step3[4] = new MBTIQuestion("我通常更喜欢上那些", "教原理和理论的课", "有具体应用性的课", 'T', 'F');
        //6-10
        /* 59 */
        Step3[5] = new MBTIQuestion("我更欣赏", "一个真情流露的人", "一个始终有着理性的人", 'P', 'J');
        /* 60 */
        Step3[6] = new MBTIQuestion("我觉得按日程表做事", "会有好处，但不喜欢", "很适合自己", 'S', 'N');
        /* 61 */
        Step3[7] = new MBTIQuestion("当我和一群人在一起时，我更多的时候是", "和认识的人一对一地说话", "参加大家的谈话", 'T', 'F');
        /* 62 */
        Step3[8] = new MBTIQuestion("参加聚会时，我", "说的时候多", "听别人说的时候多", 'E', 'I');
        /* 63 */
        Step3[9] = new MBTIQuestion("为周末要做的事情定一个日程表", "很合我意", "让我感觉很没意思", 'S', 'N');
        //11-15
        /* 64 */
        Step3[10] = new MBTIQuestion("哪一种对我来说是更高的评价", "有竞争心", "有同情心", 'J', 'P');
        /* 65 */
        Step3[11] = new MBTIQuestion("我通常更喜欢", "提前安排好社交活动", "到时候再说", 'N', 'S');
        /* 66 */
        Step3[12] = new MBTIQuestion("当我有一个工作量较大的任务时，我往往是", "先开始做,然后再考虑下一步的任务", "事先把它拆成一个个小的任务", 'T', 'F');
        /* 67 */
        Step3[13] = new MBTIQuestion("我觉得自己", "只有和那些志趣相投的人才可以保持长时间交谈", "只要愿意，和几乎任何一个人都可以长时间交谈", 'N', 'S');
        /* 68 */
        Step3[14] = new MBTIQuestion("我更喜欢", "按大家常用的、已经行之有效的方法做事", "分析尚有错误的地方，并攻克尚未解决的问题", 'I', 'E');
        //16-20
        /* 69 */
        Step3[15] = new MBTIQuestion("闲暇读书时，我", "更欣赏作者怪异、独特的表达方式", "更愿意接受作者具体明了的表达方式", 'N', 'S');
        /* 70 */
        Step3[16] = new MBTIQuestion("我更愿意有这样的老板", "宽容仁慈但经常多变的", "态度严厉但总是讲理的", 'F', 'T');
        /* 71 */
        Step3[17] = new MBTIQuestion("我喜欢按____工作", "当天的具体情况来安排", "已定好的时间表", 'N', 'S');
        /* 72 */
        Step3[18] = new MBTIQuestion("我通常", "可以轻松地和任何人谈很长时间", "只对某些人或在某些情况下，才会畅所欲言", 'F', 'T');
        /* 73 */
        Step3[19] = new MBTIQuestion("在做一个决定时，我会更多的考虑", "客观的因素", "他人的感受和建议", 'S', 'N');
    }
    private static void InitStep4(){

        Step4 = new MBTIQuestion[20];
        //1-5
        /* 74 */
        Step4[0] = new MBTIQuestion("", "宁静的", "活跃的", 'E', 'I');
        /* 75 */
        Step4[1] = new MBTIQuestion("", "有计划的", "无计划的", 'T', 'F');
        /* 76 */
        Step4[2] = new MBTIQuestion("", "抽象的", "具体的", 'J', 'P');
        /* 77 */
        Step4[3] = new MBTIQuestion("", "温和的", "坚定的", 'I', 'E');
        /* 78 */
        Step4[4] = new MBTIQuestion("", "思想", "感受", 'P', 'J');
        //6-10
        /* 79 */
        Step4[5] = new MBTIQuestion("", "事实", "猜想", 'E', 'I');
        /* 80 */
        Step4[6] = new MBTIQuestion("", "冲动", "果断", 'P', 'J');
        /* 81 */
        Step4[7] = new MBTIQuestion("", "热闹", "安静", 'E', 'I');
        /* 82 */
        Step4[8] = new MBTIQuestion("", "恬静的", "外向的", 'N', 'S');
        /* 83 */
        Step4[9] = new MBTIQuestion("", "系统的", "随意的", 'E', 'I');
        //11-15
        /* 84 */
        Step4[10] = new MBTIQuestion("", "理论推测", "真凭实据", 'P', 'J');
        /* 85 */
        Step4[11] = new MBTIQuestion("", "敏感细腻", "公正合理", 'I', 'E');
        /* 86 */
        Step4[12] = new MBTIQuestion("", "以理服人", "以情动人", 'J', 'P');
        /* 87 */
        Step4[13] = new MBTIQuestion("", "阐述事实", "表达思想", 'T', 'F');
        /* 88 */
        Step4[14] = new MBTIQuestion("", "不受拘束的", "有计划的", 'P', 'J');
        //16-20
        /* 89 */
        Step4[15] = new MBTIQuestion("", "沉默的", "健谈的", 'F', 'T');
        /* 90 */
        Step4[16] = new MBTIQuestion("", "井井有条", "随意安排", 'P', 'J');
        /* 91 */
        Step4[17] = new MBTIQuestion("", "理想", "现状", 'I', 'E');
        /* 92 */
        Step4[18] = new MBTIQuestion("", "善解人意", "深谋远虑", 'S', 'N');
        /* 93 */
        Step4[19] = new MBTIQuestion("", "注重利益", "注重情感", 'P', 'J');
    }
}
