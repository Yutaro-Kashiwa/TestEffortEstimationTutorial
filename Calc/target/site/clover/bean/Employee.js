var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":0,"methods":[{"el":12,"sc":5,"sl":8},{"el":19,"sc":5,"sl":13},{"el":31,"sc":5,"sl":21}],"name":"Employee","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":8},{"sl":13}],"name":"testCalc001","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":11},{"sl":14},{"sl":15}]},"test_1":{"methods":[{"sl":8},{"sl":13},{"sl":21}],"name":"testCalc002","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":11},{"sl":14},{"sl":15},{"sl":16},{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [0, 1], [0, 1], [0, 1], [0, 1], [], [0, 1], [0, 1], [0, 1], [1], [], [], [], [], [1], [1], [1], [1], [1], [1], [1], [1], [1], [1], [], []]
