var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":16,"methods":[{"el":16,"sc":5,"sl":10},{"el":24,"sc":5,"sl":18}],"name":"CalculatorTest","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":18}],"name":"testDivided_N002","pass":true,"statements":[{"sl":20},{"sl":21},{"sl":22},{"sl":23}]},"test_1":{"methods":[{"sl":10}],"name":"testDivided_N001","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [1], [], [1], [1], [1], [1], [], [], [0], [], [0], [0], [0], [0], [], [], []]
