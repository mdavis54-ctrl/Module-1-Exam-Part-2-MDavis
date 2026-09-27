## TCIs

### Equivalence Partitioning

| TCI   | Input     | Equivalence Partition                            | Expected Behavior                                |
| ----- | --------- | ------------------------------------------------ | ------------------------------------------------ |
| EP-01 | weight    | Less than or equal to 0                          | Invalid weight; throw `IllegalArgumentException` |
| EP-02 | weight    | Greater than 0 and less than or equal to 1200    | 0% discount                                      |
| EP-03 | weight    | Greater than 1200 and less than or equal to 3500 | Tier 2 discount rules apply                      |
| EP-04 | weight    | Greater than 3500                                | Tier 3 discount rules apply                      |
| EP-05 | isEV      | FALSE                                            | Vehicle is not an EV                             |
| EP-06 | isEV      | TRUE                                             | Vehicle is an EV                                 |
| EP-07 | isCarpool | FALSE                                            | Vehicle is not a carpool                         |
| EP-08 | isCarpool | TRUE                                             | Vehicle is a carpool                             |

### Boundary Value Analysis

| TCI    | Input  | Boundary Values      |
| ------ | ------ | -------------------- |
| BVA-01 | weight | -1, 0, 0.1           |
| BVA-02 | weight | 1199.9, 1200, 1200.1 |
| BVA-03 | weight | 3499.9, 3500, 3500.1 |

### Decision Table

| TCI   | Weight Tier        | EV? | Carpool? | Expected Discount |
| ----- | ------------------ | --- | -------- | ----------------- |
| DT-01 | Tier 1 (≤1200)     | No  | No       | 0%                |
| DT-02 | Tier 1 (≤1200)     | Yes | No       | 0%                |
| DT-03 | Tier 1 (≤1200)     | No  | Yes      | 0%                |
| DT-04 | Tier 1 (≤1200)     | Yes | Yes      | 0%                |
| DT-05 | Tier 2 (1200–3500) | No  | No       | 0%                |
| DT-06 | Tier 2 (1200–3500) | Yes | No       | 10%               |
| DT-07 | Tier 2 (1200–3500) | No  | Yes      | 10%               |
| DT-08 | Tier 2 (1200–3500) | Yes | Yes      | 15%               |
| DT-09 | Tier 3 (>3500)     | No  | No       | 5%                |
| DT-10 | Tier 3 (>3500)     | Yes | No       | 5%                |
| DT-11 | Tier 3 (>3500)     | No  | Yes      | 5%                |
| DT-12 | Tier 3 (>3500)     | Yes | Yes      | 25%               |
