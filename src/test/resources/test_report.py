from os import walk

toDiscard = ["junit-platform.properties"]

def overallUnitTests(path, tests):
    for (dirpath, dirnames, filenames) in walk(path):
        for t in filenames:
            if t != "SampleTest.java":
                tests.add(t)

def sectionsOverall(path):
    sections = 0
    for (dirpath, dirnames, filenames) in walk(path):
        if (len(dirnames) == 0):
            sections += 1
    return sections

def sectionsSuccess(path):
    sections = 0
    for (dirpath, dirnames, filenames) in walk(path):
        for t in filenames:
            if t != "SampleTest.java":
                sections += 1
                break
    return sections

testReadyPath = "./test_ready/"
testCandidatesPath = "./test_candidates/"

uniqueTests = set()

overallUnitTests(testReadyPath, uniqueTests)
readyNum = len(uniqueTests)
print("[J2EO test report] Ready/Successfull unit tests:", readyNum)
overallUnitTests(testCandidatesPath, uniqueTests)
print("[J2EO test report] Candidate unit tests:", len(uniqueTests) - readyNum)
print("[J2EO test report] Overall unit tests:", len(uniqueTests))
print("[J2EO test report] Overall sections:", sectionsOverall(testReadyPath))
print("[J2EO test report] Successfull sections:", sectionsSuccess(testReadyPath))
