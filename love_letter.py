import string


def is_palindromic(in_str):
    str_len = len(in_str)
    if str_len % 2 == 0:
        first_half = in_str[:str_len/2]
        second_half = in_str[str_len/2:]
    else:
        to_cut = (str_len - 1) / 2
        first_half = in_str[:to_cut]
        second_half = in_str[-to_cut:]
    return first_half == second_half[::-1]
