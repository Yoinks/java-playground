package patterns.builder;

        import derp.GMOFacts;
        import org.junit.Test;

public class BuilderTest {

    @Test
    public void builderInheritanceTest(){
        Shape r = new Rectangle.Builder().height(20.00).opacity(20.00).build();
        System.out.println(r);
    }

    @Test
    public void builderInheritanceTest1(){
        GMOFacts facts = new GMOFacts.Builder().GMO(true).calories(10).build();
        System.out.println(facts);
    }
}
