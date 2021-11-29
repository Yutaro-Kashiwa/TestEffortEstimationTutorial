var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":0,"methods":[{"el":7,"sc":5,"sl":5},{"el":10,"sc":5,"sl":8},{"el":13,"sc":5,"sl":11},{"el":16,"sc":5,"sl":14},{"el":22,"sc":5,"sl":17},{"el":25,"sc":5,"sl":23}],"name":"Calculator","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":5},{"sl":17},{"sl":23}],"name":"testDivided_N002","pass":true,"statements":[{"sl":6},{"sl":18},{"sl":19},{"sl":24}]},"test_1":{"methods":[{"sl":5},{"sl":17},{"sl":23}],"name":"testDivided_N001","pass":true,"statements":[{"sl":6},{"sl":18},{"sl":21},{"sl":24}]},"test_2":{"methods":[{"sl":5},{"sl":8},{"sl":14},{"sl":23}],"name":"testCalc001","pass":true,"statements":[{"sl":6},{"sl":9},{"sl":15},{"sl":24}]},"test_3":{"methods":[{"sl":5},{"sl":8},{"sl":14},{"sl":23}],"name":"testCalc002","pass":true,"statements":[{"sl":6},{"sl":9},{"sl":15},{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [1, 2, 3, 0], [1, 2, 3, 0], [], [2, 3], [2, 3], [], [], [], [], [2, 3], [2, 3], [], [1, 0], [1, 0], [0], [], [1], [], [1, 2, 3, 0], [1, 2, 3, 0], [], []]
