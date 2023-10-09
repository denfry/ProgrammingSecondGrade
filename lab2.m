clc, clearvars


x = 2:0.05:6;
y = log(x.^2 - x);
plot(x, y, 'b', 'LineWidth', 2);
xlabel('x', 'FontSize', 14);
ylabel('y = ln(x^2 - x)', 'FontSize', 14);
title('График функции y = ln(x^2 - x)', 'FontSize', 16);



[maximum_x, maximum_y] = fminbnd(@(x) - log(x^2 - x), 2, 6);
disp("maximum x:");
disp(maximum_x);
disp("maximum y:");
disp(maximum_y);
hold on;
plot(maximum_x, -maximum_y, 'ro', 'MarkerSize', 10);
legend('y = ln(x^2 - x)', ['Максимум в x = ' num2str(maximum_x)], 'Location', 'NorthEast');
hold off;