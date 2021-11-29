var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":33,"id":5,"methods":[{"el":20,"sc":5,"sl":11},{"el":32,"sc":5,"sl":22}],"name":"TestSalaryCalculation","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":11}],"name":"testCalc001","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19}]},"test_1":{"methods":[{"sl":22}],"name":"testCalc002","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":31}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [0], [], [0], [0], [0], [0], [0], [0], [0], [], [], [1], [], [1], [1], [1], [1], [1], [1], [1], [1], [], []]
