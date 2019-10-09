MAIN_MENU = 0
DIFFICULTY_SELECTION = 1
IN_GAME = 2

WELCOME_TEXT = <<-HEREDOC
--------------------------
Mind Trainer. - Version: 0.0.0-inDev
--------------------------

 - q: Exit game
 - play

HEREDOC

DIFF_TEXT = <<-HEREDOC
Select dificulty: 
 - 1: Easy
 - 2: Normal
 - 3: Hard
HEREDOC

GAME_START_TEXT = <<-HEREDOC
Game Start!
 - Press 'q' any moment to exit.
HEREDOC

# Uses freeze in order to create an static array
OPERATIONS = ['+', '-', '*'].freeze

DIFFICULTY_RANGES = [
  #  Easy
  {
    '+': { 'a': 1..10, 'b': 1..10 },
    '-': { 'a': 1..10, 'b': 1..5 },
    '*': { 'a': 1..5, 'b': 1..3 },
    'required_corrects': 5
  },
  # Normal
  {
    '+': { 'a': 1..30, 'b': 1..30 },
    '-': { 'a': 1..25, 'b': 1..20 },
    '*': { 'a': 1..20, 'b': 1..10 },
    'required_corrects': 10
  },
  # Hard
  {
    '+': { 'a': 1..100, 'b': 1..50 },
    '-': { 'a': 1..100, 'b': 1..50 },
    '*': { 'a': 1..50, 'b': 1..15 },
    'required_corrects': 15
  }
]

# Generates a diferent number than the last one.
def generate_different_number(last, range)
  tmp = last

  while tmp == last
    tmp = rand(range)
  end

  return tmp
end

# Gets a different element from the array
def generate_different_operation(last, operations)
  tmp = last

  while tmp == last
    tmp = operations.sample
  end

  return tmp
end

# TODO: Game start

# TODO: Dificulty Selection
# Can be 0..5
difficulty = 0

game_status = MAIN_MENU

running = true

# IN_Game variables
should_generate_new_game = true
a = 0
b = 0
op = ''
correct_answers = 0

# Game loop
while running
  case game_status
  # -------------------------------
  when MAIN_MENU
    puts(WELCOME_TEXT)

    print('Action: ')
    input = gets.chomp

    if input == 'q'
      running = false
    elsif input == 'play'
      game_status = DIFFICULTY_SELECTION
    end
  # -------------------------------
  when DIFFICULTY_SELECTION
    puts(DIFF_TEXT)
    print('Dificulty: ')
    input = gets.chomp.to_i

    if input >= 1 || input <= 3
      puts(GAME_START_TEXT)
      difficulty = input

      correct_goal = DIFFICULTY_RANGES[difficulty - 1][:required_corrects]
      game_status = IN_GAME

      puts(" - GOAL: #{correct_goal}")

      # Reset the in game variables
      should_generate_new_game = true
      a = 0
      b = 0
      op = ''
      correct_answers = 0
    else
      puts('Invalid dificulty...')
    end
  # -------------------------------
  when IN_GAME
    if should_generate_new_game
      op = generate_different_operation(op, OPERATIONS)

      ranges = DIFFICULTY_RANGES[difficulty - 1][op.to_sym]

      a = generate_different_number(a, ranges[:a])
      b = generate_different_number(b, ranges[:b])
    end

    case op
    when '+'
      res = a + b
    when '-'
      res = a - b
    when '*'
      res = a * b
    end

    print("#{a} #{op} #{b} = ")
    input = gets.chomp

    # Check if the user answer is correct or quit
    if input == 'q'
      game_status = MAIN_MENU
    else
      user_res = input.to_i

      if user_res == res
        correct_goal = DIFFICULTY_RANGES[difficulty - 1][:required_corrects]
        correct_answers += 1
        should_generate_new_game = true

        puts("- CORRECT - #{correct_answers}/#{correct_goal}")

        if correct_answers >= correct_goal
          puts('Juego terminado! PUTO AMO COÑO')

          game_status = MAIN_MENU
        end
      else
        puts('No correct...')
        should_generate_new_game = false
      end
    end
  end
end
