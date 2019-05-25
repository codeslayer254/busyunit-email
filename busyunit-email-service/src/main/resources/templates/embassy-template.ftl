<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Custom Title Here....sasawa</title>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

    <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>

    <!-- use the font -->
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            font-size: 48px;
        }
    </style>
</head>
<body style="margin: 0; padding: 0;">
    <p>${message}</p>
    <table align="center" border="0" cellpadding="0" cellspacing="0" width="600" style="border-collapse: collapse;">
        <tr>
            <td bgcolor="#eaeaea" style="padding: 40px 30px 40px 30px;">
                <p>Dear ${receiverName},</p>
                <p>
                    <img src="https://res.cloudinary.com/dpnxlc0jh/image/upload/v1558759720/madaraka_invite_ncw75s.png" alt="Madaraka Day 2019" style="display: block;"
                         href="https://docs.google.com/forms/d/e/1FAIpQLScLOiOJhASyX-1CfgyYBGC9ZYiqTm7EVsU7-1BOpm3qsj0lrw/viewform?c=0&w=1" target="_blank"/>
                </p>
            </td>
        </tr>
        <tr>
            <td bgcolor="#000000" style="padding: 30px 30px 30px 30px; color: white">
                <p>${senderName}</p>
                <p>${signature.name}</p>
                <p>${signature.location}</p>
                <p>${signature.signature}</p>
            </td>
        </tr>
    </table>

</body>
</html>