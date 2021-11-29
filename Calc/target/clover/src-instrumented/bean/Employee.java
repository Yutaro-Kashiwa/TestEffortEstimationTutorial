/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package bean;

public class Employee {public static class __CLR4_2_000kwkpbji7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0079\u0075\u0074\u0061\u0072\u006f\u006b\u0061\u0073\u0068\u0069\u0077\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0032\u0030\u0030\u005f\u0044\u0065\u0076\u0065\u006c\u006f\u0070\u006d\u0065\u006e\u0074\u002f\u0032\u0031\u0030\u005f\u0047\u0069\u0074\u002f\u0054\u0065\u0073\u0074\u0045\u0066\u0066\u006f\u0072\u0074\u0045\u0073\u0074\u0069\u006d\u0061\u0074\u0069\u006f\u006e\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u002f\u0043\u0061\u006c\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1638192169084L,8589935092L,20,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public String name;
    public int wage;
    public int totalWorkingHours;

    public Employee(String name, int wage){try{__CLR4_2_000kwkpbji7.R.inc(0);
        __CLR4_2_000kwkpbji7.R.inc(1);this.name=name;
        __CLR4_2_000kwkpbji7.R.inc(2);this.wage = wage;
        __CLR4_2_000kwkpbji7.R.inc(3);this.totalWorkingHours = 0;
    }finally{__CLR4_2_000kwkpbji7.R.flushNeeded();}}
    public void recordWorking(int hours){try{__CLR4_2_000kwkpbji7.R.inc(4);
        __CLR4_2_000kwkpbji7.R.inc(5);this.totalWorkingHours+=hours;
        __CLR4_2_000kwkpbji7.R.inc(6);if ((((this.totalWorkingHours>100)&&(__CLR4_2_000kwkpbji7.R.iget(7)!=0|true))||(__CLR4_2_000kwkpbji7.R.iget(8)==0&false))){{
            __CLR4_2_000kwkpbji7.R.inc(9);print();
        }

    }}finally{__CLR4_2_000kwkpbji7.R.flushNeeded();}}

    private void print() {try{__CLR4_2_000kwkpbji7.R.inc(10);
        __CLR4_2_000kwkpbji7.R.inc(11);System.out.println();
        __CLR4_2_000kwkpbji7.R.inc(12);System.out.println();
        __CLR4_2_000kwkpbji7.R.inc(13);System.out.println();
        __CLR4_2_000kwkpbji7.R.inc(14);System.out.println();
        __CLR4_2_000kwkpbji7.R.inc(15);System.out.println();
        __CLR4_2_000kwkpbji7.R.inc(16);System.out.println();
        __CLR4_2_000kwkpbji7.R.inc(17);System.out.println();
        __CLR4_2_000kwkpbji7.R.inc(18);System.out.println();
        __CLR4_2_000kwkpbji7.R.inc(19);System.out.println();
    }finally{__CLR4_2_000kwkpbji7.R.flushNeeded();}}
}
