clc, clearvars
A = [-5, 19, -8, 19; 10, 3, 4, -9; 12, 14, -16, 2; -3, -17, -2, 8]
b = [0; -4; 18; 19]
A_det = det(A)
A_inv = inv(A);
disp("A_inv")
x = A_inv * b
disp("Метод Гаусса")
x = A \ b
disp("Функция matlab")
x = linsolve(A, b)

x1 = -5*x(1) +19*x(2) -8*x(3) +19*x(4)
x2 = 10*x(1) + 3*x(2) +4*x(3) -9*x(4)
x3 = 12*x(1) +14*x(2) -16*x(3) +2*x(4)
x4 = -3*x(1) -17*x(2) -2*x(3) +8*x(4)

%полиномы

p = [1  2 -8]
r = roots(p)


x = -5:0.000001:3;
y = x.^2+2*x-8;
plot(x, y), grid on
