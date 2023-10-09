clc, clearvars

% Задача 1
N_discrete = 160;
p = 0.1;
discrete_values = binornd(7, p, N_discrete, 1);

% Задача 2
N_continuous = 390;
mu = 0;
sigma = 2.07;
continuous_values = normrnd(mu, sigma, N_continuous, 1);
% Задача 3
cv_sort = sort(continuous_values);
f = ones(N_continuous, 1)/N_continuous;
F = cumsum(f);
stairs(cv_sort, F, '-k');
% easy way: ecdf(continuous_values, '-k');

% Задача 4
[par1, par2, ci1, ci2] = normfit(continuous_values);
FR=normcdf(continuous_values,par1,par2);
[h, p] = kstest(continuous_values,[continuous_values,FR],0.05);

FR2=expcdf(continuous_values,5);
[h1, p1] = kstest(continuous_values,[continuous_values,FR2],0.05);

% Задача 6
x7 = normrnd(mu, sigma, 100, 1);
histogram(x7, 7);
x17 = normrnd(mu, sigma, 1000, 1);
histogram(x17, 17);
x117 = normrnd(mu, sigma, 10000, 1);
histogram(x117, 117);
x137 = normrnd(mu, sigma, 100000, 1);
histogram(x137, 137);





