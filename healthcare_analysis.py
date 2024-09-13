import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import classification_report, confusion_matrix

data = pd.read_csv('healthcare_data.csv')

def plot_current_trends(data):
    plt.figure(figsize=(10, 6))
    sns.countplot(data=data, x='condition')
    plt.title('Distribution of Health Conditions')
    plt.xticks(rotation=45)
    plt.show()

def predictive_analysis(data):
    features = pd.get_dummies(data[['age', 'condition']])
    target = data['outcome']

    X_train, X_test, y_train, y_test = train_test_split(features, target, test_size=0.3, random_state=42)

    model = RandomForestClassifier()
    model.fit(X_train, y_train)

    predictions = model.predict(X_test)
    print("Classification Report:\n", classification_report(y_test, predictions))
    print("Confusion Matrix:\n", confusion_matrix(y_test, predictions))

def resource_management(data):
    plt.figure(figsize=(10, 6))
    sns.countplot(data=data, x='treatment')
    plt.title('Resource Utilization by Treatment Type')
    plt.xticks(rotation=45)
    plt.show()

def personal_care(data):
    condition = 'Hypertension'
    patient_data = data[data['condition'] == condition]
    print(f"Patient data for condition {condition}:\n", patient_data.head())

plot_current_trends(data)
predictive_analysis(data)
resource_management(data)
personal_care(data)
