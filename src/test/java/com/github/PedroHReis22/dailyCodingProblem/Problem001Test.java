package com.github.PedroHReis22.dailyCodingProblem;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Problem001Test {

    Problem001 problem001 = new Problem001();

    @Test
    public void solve_givenListWithNoSolution_shouldReturnFalse() {
        Assert.assertFalse(problem001.solve(List.of(1, 2, 3, 4, 5, 6), 0));
    }

    @Test
    public void solve_givenListWithPossibleSolution_shouldReturnTrue() {
        Assert.assertTrue(problem001.solve(List.of(10, 15, 3, 7), 17));
    }

}
