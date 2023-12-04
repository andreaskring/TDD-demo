import pytest

from demo.yatzy import score_chance, score_twos, score, Category


# [DONE] The roll 2,2,3,2,5 within the category TWOS should score 6
# [DONE] The roll 2,2,3,2,2 within the category TWOS should score 8
# [DONE] The roll 3,4,3,5,5 within the category TWOS should score 0
# The roll 3,4,3,5,5 within the category FIVES should score 10

# [DONE] The roll 3,4,3,5,5 within the category CHANCE should score 20
# [DONE] The roll 1,2,3,4,4 within the category CHANCE should score 14

# The roll 3,3,3,3,3 within the category YATZY should score 50
# The roll 1,3,3,3,3 within the category YATZY should score 0

# If the first dice is 0, a ValueError should be raised
# If the second dice is 7, a ValueError should be raised
# [DONE] Raise exception if length of dice tuple is greater than 5

def test_score_raises_value_error_for_more_than_5_dices():
    with pytest.raises(ValueError):
        # Act + Assert
        score(Category.FIVES, (1, 2, 3, 4, 5, 6, 7))


def test_score_chance_returns_20_for_roll_34355():
    # Act
    score = score_chance((3, 4, 3, 5, 5))

    # Assert
    assert score == 3 + 4 + 3 + 5 + 5


def test_score_chance_returns_14_for_roll_12344():
    # Act
    score = score_chance((1, 2, 3, 4, 4))

    # Assert
    assert score == 1 + 2 + 3 + 4 + 4


@pytest.mark.parametrize(
    "roll, expected",
    [
        ((2, 2, 3, 2, 5), 6),
        ((2, 2, 3, 2, 2), 8),
        ((3, 4, 3, 5, 5), 0),
    ]
)
def test_score_twos_returns_0_for_roll_34355(roll, expected):
    # Act
    score = score_twos(roll)

    # Assert
    assert score == expected
