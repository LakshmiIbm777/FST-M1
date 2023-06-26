# Import pandas
import pandas
from pandas import ExcelFile
from pandas import ExcelWriter

# Create a dictionary that will be used to create the DataFrame
data = {
'FirstName':["Sadhana", "Anvesh", "Amrutha"],
'LastName':["J", "I", "T"],
'Email':["Sadhana@example.com", "Anvesh@example.com", "Amrutha.Th@example.com"],
'PhoneNumber':["23443333", "489334343", "4358727830"]
}

# Create the DataFrame that will be written to the excel file
dataframe = pandas.DataFrame(data)

# Print the dataframe
print(dataframe)

# Write the dataframe to a Excel file
writer = ExcelWriter('Sample.xlsx')
dataframe.to_excel(writer,'Sheet1',index = False)

# Commit data to the Excel file
writer.save()