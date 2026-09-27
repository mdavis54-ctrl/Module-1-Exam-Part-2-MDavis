## Test Cases

| Test Case | Weight |   EV  | Carpool | Expected Result | Purpose                             |
| --------- |-------:| :---: | :-----: |----------------:| ----------------------------------- |
| TC-01     |     -1 | False |  False  |   Illegal Input | Tests negative weight               |
| TC-02     |      0 | False |  False  |   Illegal Input | Tests zero weight                   |
| TC-03     |    0.1 | False |  False  |              0% | Tests minimum valid weight          |
| TC-04     |   1200 |  True |   True  |              0% | Tests upper boundary of Tier 1      |
| TC-05     | 1200.1 | False |  False  |              0% | Tests just above Tier 1             |
| TC-06     |   2000 | False |  False  |              0% | Tests Tier 2 with neither condition |
| TC-07     |   2000 |  True |  False  |             10% | Tests Tier 2 with EV only           |
| TC-08     |   2000 | False |   True  |             10% | Tests Tier 2 with carpool only      |
| TC-09     |   2000 |  True |   True  |             15% | Tests Tier 2 with EV and carpool    |
| TC-10     |   3500 |  True |   True  |             15% | Tests upper boundary of Tier 2      |
| TC-11     | 3500.1 | False |  False  |              5% | Tests just above Tier 2             |
| TC-12     |   4000 | False |  False  |              5% | Tests Tier 3 baseline discount      |
| TC-13     |   4000 |  True |  False  |              5% | Tests Tier 3 with EV only           |
| TC-14     |   4000 | False |   True  |              5% | Tests Tier 3 with carpool only      |
| TC-15     |   4000 |  True |   True  |             25% | Tests Tier 3 with EV and carpool    |