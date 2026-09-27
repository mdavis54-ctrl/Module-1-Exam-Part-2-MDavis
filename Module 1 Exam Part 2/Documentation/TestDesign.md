## Purpose
The purpose of TollCalculator is to be the code for an "Eco-Friendly Vehicle Toll Booth". This project tests that code.

### Equivalence Classes:
| Equivalence Class | Condition               | Expected Behavior |
| ----------------- | ----------------------- | ----------------- |
| EC-1              | `weight <= 0`           | Exception         |
| EC-2              | `0 < weight <= 1200`    | 0%                |
| EC-3              | `1200 < weight <= 3500` | 0%, 10%, or 15%   |
| EC-4              | `weight > 3500`         | 5% or 25%         |

### Tier 2 Decision Analysis:
| EV    | Carpool | Expected |
| ----- | ------- | -------: |
| False | False   |       0% |
| True  | False   |      10% |
| False | True    |      10% |
| True  | True    |      15% |

### Tier 3 Decision Analysis:
| EV    | Carpool | Expected |
| ----- | ------- | -------: |
| False | False   |       5% |
| True  | False   |       5% |
| False | True    |       5% |
| True  | True    |      25% |

