## Faults

| Fault | Intentional Change                                                                    | Test Case(s) That Should Detect It |
|-------|---------------------------------------------------------------------------------------|------------------------------------|
| F1    | Change `weight > 1200` to `weight >= 1200`                                            | TC-04                              |
| F2    | Change `weight <= 3500` to `weight < 3500`                                            | TC-10                              |
| F3    | Change `weight > 3500` to `weight >= 3500`                                            | TC-10                              |
| F4    | Change the Tier 2 EV/Carpool discount from `0.10` to `0.15`                           | TC-07, TC-08                       |
| F5    | Change the Tier 3 baseline discount from `0.05` to `0.10`                             | TC-12                              |
| F6    | Change the Tier 3 condition from `isEV && isCarpool` to `isEV (Logical OR) isCarpool` | TC-13, TC-14                       |
| F7    | Remove the `weight <= 0` exception check                                              | TC-01, TC-02                       |