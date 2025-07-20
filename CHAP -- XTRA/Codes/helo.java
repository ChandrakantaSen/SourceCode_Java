public class helo {
  public static void main(String[] args) {
    int A[] = { 23, 47, 81, 95 };
    int B[] = { 7, 14, 39, 55, 62, 74 };
    int C[] = new int[10];

    merge(A, A.length, B, B.length, C);
    for (int i : C) {
      System.out.println(i);

    }
  }

  public static void merge(int[] A, int sizeA, int[] B, int sizeB, int[] C) {
    int AIndex = 0, BIndex = 0, CIndex = 0;

    while (AIndex < sizeA && BIndex < sizeB)
      if (A[AIndex] < B[BIndex])
        C[CIndex++] = A[AIndex++];
      else
        C[CIndex++] = B[BIndex++];

    while (AIndex < sizeA)
      C[CIndex++] = A[AIndex++];

    while (BIndex < sizeB)
      C[CIndex++] = B[BIndex++];
  }
}