#
# It is necessary to run this script from the 'test_candidates' folder
# and to have J2EO.jar file there as well.
#

import os

def findJavaSources(path, tests):
    for (dirpath, dirnames, filenames) in os.walk(path):
        for t in filenames:
            if t != "SampleTest.java":
                tests.add(os.path.join(dirpath, t))

tests = set()
testCandidatesPath = os.path.join('.')
translatedPath = os.path.join('..','translated_tests')

findJavaSources(testCandidatesPath, tests)

for t in tests:
    path = t.rsplit(os.sep, 1)[0]
    file = t.rsplit(os.sep, 1)[1]
    print('Translating ' + file + ' file...')
    os.system('java -jar ./J2EO-0.4.0.jar ' + t + ' -o ' + translatedPath + os.sep + path)

