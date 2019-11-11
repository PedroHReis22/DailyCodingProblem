package com.github.PedroHReis22.dailyCodingProblem;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem001 {

    public boolean solve(List<Integer> input, int k) {
        Set<Integer> set = new HashSet<>(input);
        return input.stream().anyMatch(i -> set.contains(k - i));
    }

}
