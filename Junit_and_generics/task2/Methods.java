package Junit_and_generics.task2;

import java.util.List;

public class Methods {
        public int returnElementsSum(List<? extends Summable> my_collection) {
                int sum = 0;
                for(var el : my_collection) {
                        if(el instanceof MyMatrix) {
                                sum += calculate_sum_matrix((MyMatrix) el);
                        } else {
                                sum += calculate_sum_vector3((Vector3) el);
                        }
                }
                return sum;
        }

        private int calculate_sum_matrix(MyMatrix el) {
                int sum = 0;
                for(int i = 0; i < 4; ++i) {
                        for(int j = 0; j < 4; ++j) {
                                sum += el.my_matrix[i][j];
                        }
                }
                return sum;
        }

        private int calculate_sum_vector3(Vector3 el) {
                return (int) (el.x + el.y + el.z);
        }
}
