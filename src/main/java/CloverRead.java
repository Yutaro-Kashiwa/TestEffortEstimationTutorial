import clover.org.jfree.ui.about.ProjectInfo;
import com.atlassian.clover.CloverDatabase;
import com.atlassian.clover.CoverageData;
import com.atlassian.clover.CoverageDataSpec;
import com.atlassian.clover.api.CloverException;
import com.atlassian.clover.api.registry.*;
import com.atlassian.clover.optimization.SnapshotPrinter;
import com.atlassian.clover.registry.CoverageDataProvider;
import com.atlassian.clover.registry.entities.FullClassInfo;
import com.atlassian.clover.registry.entities.FullFileInfo;
import com.atlassian.clover.registry.entities.FullProjectInfo;
import com.atlassian.clover.registry.entities.TestCaseInfo;
import com.atlassian.clover.reporters.xml.XMLReporter;
import java.io.PrintStream;
import java.util.*;

public class CloverRead {

    public static void main(String[] args) throws Exception {
        OpenCloverController occ = new OpenCloverController();

        occ.getPath("signature");
    }


}
