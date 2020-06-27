import com.atlassian.clover.CloverDatabase;
import com.atlassian.clover.CoverageData;
import com.atlassian.clover.CoverageDataSpec;
import com.atlassian.clover.api.CloverException;
import com.atlassian.clover.api.registry.*;
import com.atlassian.clover.registry.entities.*;

import java.io.PrintStream;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenCloverController {
    String pos = "/Users/yutarokashiwa/Documents/200_Development/210_Git/TestEffortEstimationTutorial/target/clover/clover.db";
    CoverageData coverageData;
    FullProjectInfo projectInfo;
    CloverDatabase db;
    Map<Integer, String> bitMaps;
   ;

    public OpenCloverController() throws CloverException {
        // read clover database together with coverage recording files, use time span=0 (latest build)
        db = CloverDatabase.loadWithCoverage(pos, new CoverageDataSpec());
        coverageData = db.getCoverageData();
        projectInfo = db.getRegistry().getProject();
        setMap();
    }

    /**
     * これをつかって，テストシグネチャが渡されたとき，通ったみちをかえす
     * //signature, List<"signature:line">
     * @param signature
     */
    public Map<String, List<String>> getPath(String signature) {
        Map<String, List<String>> coverage = null;
        TestCaseInfo tci= getTestCaseInfo(signature);
        BitSet bit = coverageData.getHitsFor(tci);
        return coverage;
    }

    private static TestCaseInfo getTestCaseInfo(String signature) {
        return null;
    }

    private void setMap() {
        bitMaps = new HashMap<>();
        FullProjectInfo fullProjectInfo = db.getFullModel();
        for (PackageInfo packageInfo : fullProjectInfo.getAllPackages()) {
            System.out.println("package: " + packageInfo.getName());
            for (FileInfo fileInfo : packageInfo.getFiles()) {
                System.out.println("\tfile: " + fileInfo.getName());
                for (ClassInfo classInfo : fileInfo.getClasses()) {
                    System.out.println("\t\tclass: " + classInfo.getName());
                    FullClassInfo cfi = (FullClassInfo) classInfo;
                    List<? extends MethodInfo> miList = cfi.getMethods();
                    FullMethodInfo fi;
                    for(MethodInfo mi: miList){
                        System.out.println(mi.getDataIndex()+":"+mi.getName());
                        for(StatementInfo s: mi.getStatements()){
                            FullStatementInfo sm = (FullStatementInfo)s;
                            System.out.println(sm.getDataIndex()+":"+sm.getStartLine()+":"+sm.getRelativeDataIndex()+":"+sm.getContext());
                        }
                        int srcStartLine = mi.getStartLine();
                        int totalLines = mi.getEndLine()-srcStartLine;

                        //TODO: indexが意味わからん
//                        for(int j=srcStartLine;j<=mi.getEndLine();j++){
//                            System.out.println(j+":"+mi.getName());
//                        }
                        List<? extends StatementInfo> list = mi.getStatements();
                        for(int i=mi.getDataIndex();i<mi.getDataIndex()+mi.getDataLength();i++){
//                            bitMaps.put(i, mi.getName()+":"+srcStartLine);//TODO: シグネチャに変更
//                            //TODO: アノテーションのライン（NOT数）だけ＋１
//                            System.out.println(i+":"+mi.getName());
                            srcStartLine++;
                        }
                        System.out.println("--");
                    }
                }
            }
        }
    }

}
