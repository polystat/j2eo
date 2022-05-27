# Acceptance guide

J2EO has two major acceptance criteria:
- crash-less operation on large Java projects (even if translation results are not completely accurate, i.e. some semantic parts are missing)
- Coverage of features requested by Polystat

To assess the project maturity, we included bash scripts that download some popular open-source Java projects and runs J2EO on them:

| Project | Script             |
|---------|--------------------|
| Hadoop  | `./test-hadoop.sh` |
| Kafka   | `./test-kafka.sh`  |

Keep in mind, as the development of J2EO progresses and 1.0 release is not out, performance problems may persist, and translation of large files may take longer than satisfactory.

## Performing the assessment

To run the scripts on your own machine, you may `cd` into the repository directory and run either of the scripts provided in the table above.

The script will build J2EO from the current checked out source code, download repo if it is missing, and start J2EO with arguments targeting the downloaded project.

All data is stored in the `j2eo-data directory`, including original source code and translation results.

Unfortunately, currently there is no integration with Polystat, so second criterion may only be checked manually. We work on automatization of this part.
