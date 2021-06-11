# Readme

This application is builded by Zhouo Haopeng

Student ID: s3555521

## How to run the application
 
Click the main class in the /src/main, the application will run.

If user do not log in, other class will not work. There is a user authentication.

There are 3 button which can do login, register and forgetpassword.

When you log in, there will a session create by the username, which will use for the booking system.

There is an admin account, username: admin , password: admin.

Register will create an employee but cannot be an admin, the admins are only create by admin.

Register will also create a blacklist for the user.

Forget password will require the secret question and answer which gave by register.


Main UI for the employee:

step 1:
select the date and click the choose button, then will show the booking history

step 2:
click the green sit for the booking

account button:
new windows for the account information, only change the password, no need the question and answer

booking button:
new windows for the booking information, only delete. Because there is no time validation,
user can delete it anytime, and it will not affect the released bookings.

The employee will not allow booking same sit with last booking which in the blacklist.
Not allow to have two bookings in the time, until admin change the blacklist or user delete the booking.

Main UI for the admin:

Admin can edit any user information but the id. The id cannot be change, only way to change is to delete the user and create new one

Admin can edit the blacklist.

Admin can cancel and lock the sits. The change will only show in the bookings, admin have to release the booking every day.
Once released, user can have new booking.

Admin can generate the report of employee list and released booking list.

Finally:
The application achieve all functions but time validation. It seems like to be complex in my validation logical.
So, I do not achieve that function.
