import random

def read_input_file(filename):
    with open(filename, 'r', encoding='utf-8') as file:
        lines = file.readlines()
    return lines

def write_output_file(filename, result):
    with open(filename, 'w', encoding='utf-8') as file:
        file.write(result)

def task_9_1(N):
    pol = 0
    s = 0
    A = [[random.randrange(10) for i in range(N)] for j in range(N)]
    for i in range(N):
        for j in range(i + 1, N):
            if A[i][j] <= 0:
                continue
            if A[i][j] > 0:
                pol += 1
                s += A[i][j]
    return f'Задание 9.1:\nСумма элементов: {s}\nЧисло элементов: {pol}\n\n'


def task_9_2(N, M):
    B = [[random.randrange(10) for i in range(M)] for j in range(N)]
    result = 'Задание 9.2:\n'
    for i, row in enumerate(B):
        max_idx = min_idx = 0
        for j, elem in enumerate(row):
            if elem > row[max_idx]:
                max_idx = j
            if elem < row[min_idx]:
                min_idx = j

        row[max_idx], row[0] = row[0], row[max_idx]

        row[min_idx], row[-1] = row[-1], row[min_idx]

        result += f'{row}\n'
    return result


def main():

    students_data = read_input_file('vvod.txt')

    all_results = ""

    for line in students_data:
        student = line.strip().split()


        if len(student) < 7:
            print(f"Ошибка: строка {line.strip()} имеет недостаточно данных.")
            continue

        fio = ' '.join(student[1:4])
        group = student[4]


        try:
            N = int(student[5])
            M = int(student[6])
        except ValueError:
            print(f"Ошибка: Некорректный размер матрицы в строке: {line.strip()}")
            continue

        result_9_1 = task_9_1(N)
        result_9_2 = task_9_2(N, M)

        all_results += f'Результаты для {fio} (Группа: {group}):\n'
        all_results += result_9_1
        all_results += result_9_2
        all_results += '\n'


    output_filename = "vivod_all_results.txt"
    write_output_file(output_filename, all_results)

    print(f'Результаты всех студентов записаны в файл: {output_filename}')


# Запуск программы
main()
