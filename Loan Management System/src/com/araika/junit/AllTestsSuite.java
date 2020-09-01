package com.araika.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ GetEMIDateTest.class, PrincipalEMITest.class, resultAmtTest.class, TotalEMITest.class })
public class AllTestsSuite {

}
