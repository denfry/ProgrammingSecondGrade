clc, clearvars
A = [-6 15 14 -3; 4 -12 18 -10; -19 -7  4 -5; 6 10 8 -13];
B = [-18 -10 -12 19; -13 6 16 -9; -10 11 10 -4; -14 3 -15 -9];
p = 3;

SumofAnB = A + B;
ProdofAnB = A * B;
disp('SumofAnB')
disp(SumofAnB)
disp('ProdofAnB')
disp(ProdofAnB)

ElementProdofAnB = A .* B;
ElementDivisionofAnB = A ./ B;
ElementExpofA = A .^ p;
ElementExpofB = B .^ p;
disp('ElementProdofAnB')
disp(ElementProdofAnB)
disp('ElementDivisionofAnB')
disp(ElementDivisionofAnB)
disp('ElementExpofA')
disp(ElementExpofA)
disp('ElementExpofB')
disp(ElementExpofB)

InversionofA = inv(A);
disp('InversionofA')
disp(InversionofA)
InversionofB = inv(B);
disp('InversionofB')
disp(InversionofB)

CheckReverseForA = A * InversionofA;
disp('CheckReverseForA')
disp(CheckReverseForA)
CheckReverseForB = B * InversionofB;
disp('CheckReverseForB')
disp(CheckReverseForB)

TransposeA = A.';
disp('TransposeA')
disp(TransposeA)
TransposeB = B.';
disp('TransposeB')
disp(TransposeB)


[rowsA, colsA] = find(mod(A, 5) == 0);
[rowsB, colsB] = find(mod(B, 5) == 0);

disp('Matrix A:');  
disp(A);
disp('Elements divisible by 5 in the matrix A:');
for i = 1:length(rowsA)
    fprintf('Row %d, Column %d: %d\n', rowsA(i), colsA(i), A(rowsA(i), colsA(i)));
end
fprintf('\n')
disp('Matrix B:');
disp(B);
disp('Elements divisible by 5 in the matrix B:');
for i = 1:length(rowsB)
    fprintf('Row %d, Column %d: %d\n', rowsB(i), colsA(i), B(rowsB(i), colsB(i)));
end





