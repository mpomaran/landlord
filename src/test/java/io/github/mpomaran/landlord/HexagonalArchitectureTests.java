package io.github.mpomaran.landlord;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@AnalyzeClasses(packages = "io.github.mpomaran.landlord")
public class HexagonalArchitectureTests {
    @ArchTest
    public static final ArchRule model_should_not_depend_on_infrastructure =
            noClasses()
                    .that()
                    .resideInAPackage("..model..")
                    .should()
                    .dependOnClassesThat()
                    .resideInAPackage("..infrastructure..");
}
