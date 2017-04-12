/**
 * 
 */

package com.tocea.course.cleancode.module2.badsmell.primitiveobsess;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.tocea.course.cleancode.module2.badsmell.primitiveobsess.exercice1.PrimitiveObsessionExercice1;



/**
 * @author sleroy
 */
public class PrimitiveObsessionExercice1Test
{
    
    
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
    
    
        //
    }
    
    
    /**
     * Test method for
     * {@link com.tocea.course.cleancode.module2.badsmell.primitiveobsess.exercice1.PrimitiveObsessionExercice1#compteSumOfSalaries(String[])}} .
     */
    @Test
    public final void testCompteSumOfSalaries() {
    
    
        final PrimitiveObsessionExercice1 primitiveObsessionExercice1 =
                new PrimitiveObsessionExercice1();
        Assert.assertEquals(5400 + 7800 + 1, primitiveObsessionExercice1
                .compteSumOfSalaries(PrimitiveObsessionExercice1.personData));
    }
    
}
